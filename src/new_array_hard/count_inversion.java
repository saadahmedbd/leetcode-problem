package new_array_hard;

import java.util.ArrayList;
import java.util.List;

public class count_inversion {
    public static void main(String[] args) {
        int nums[]={5,4,3,2,1};
        int n= nums.length;
        int ans =team(nums, n);
//        System.out.println(countInversion(nums));
        System.out.println(ans);
    }
    public static int countInversion(int nums[]){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                if(nums[i] >nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int merge(int nums[], int low, int mid, int high){
        List<Integer> temp =new ArrayList<>();
        int left =low, right =mid+1;
        int count =0;
        while (left<=mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                count += (mid -left +1);
                right++;
            }
        }
        while (left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while (right <= high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i] =temp.get(i-low);
        }
        return count;
    }
    public static int mergeSort(int nums[], int low,  int high){
        int count =0;
        if(low >= high) return count;
        int mid =(high+low)/2;
        count += mergeSort(nums, low, mid);
        count+= mergeSort(nums, mid+1, high);
        count += merge(nums, low, mid, high);
        return count;
    }
    public static int team (int [] skill, int n){
        return mergeSort(skill, 0, n-1);
    }

}
