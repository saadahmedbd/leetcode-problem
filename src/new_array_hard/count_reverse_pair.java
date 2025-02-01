package new_array_hard;

import java.util.ArrayList;
import java.util.List;

public class count_reverse_pair {
    public static void main(String[] args) {
        int [] a={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int nums []={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
//        System.out.println(team(a));
        int n=nums.length;
        int cnt = team(nums, n);
        System.out.println(cnt);

    }
//    this ans not suitable for big number
    public static int count_reverse(int[] a){
        int n=a.length;

        // Count the number of pairs:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > 2 * a[j])
                    cnt++;
            }
        }
        return cnt;
    }
    public static int team(int[] skill) {
        return count_reverse(skill);
    }




    public static void merger(int [] nums, int low, int mid, int high){
        List<Integer> temp =new ArrayList<>();
        int left =low;
        int right =mid+1;
        while(left <= mid && right <=high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else {
                temp.add(nums[right]);
                right++;
            }
        }
        // if elements on the left half are still left //
        while (left <= mid){
            temp.add(nums[left]);
            left++;
        }
        //  if elements on the right half are still left //
        while (right <= high){
            temp.add(nums[right]);
            right++;
        }
        // transfering all elements from temporary to arr //
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
    public static int countPair (int nums[], int low, int mid, int high){
        int count =0;
        int right =mid+1;
        for(int i =low;i<=mid;i++){
            while( nums[i] > 2L * nums[right]) right++;
            count += (right -(mid+1));
        }
        return count;
    }
    public static int mergeSort (int [] nums, int low, int high){
        int count =0;
        if(low >= high) return count;
        int mid =(high +low)/2;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countPair(nums, low, mid, high);
        merger(nums, low, mid, high);
        return count;
    }
    public static int team(int[] skill, int n) {
        return mergeSort(skill, 0, n - 1);
    }



}
