package Job_preparation;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class string_question {
    public static void main(String[] args) {
//        int nums =123;
//        System.out.println(reverseInt(nums));
        int num []={2,3,4,12,6,4,6};
        System.out.println(maximumNumber(num));

        int [] nums1 ={1,7,9};
        int [] nums2 ={1,4,5,6};
//        System.out.println(margeTwosortedArr(nums1, nums2));

//        int nums []= {5,2,4,6,2,8, 6};
//        System.out.println(duplicateValues(nums));

//        int nums []= {0,1,0,2,3};
//        moveZeros(nums);
        int nums []={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSum(nums));
        System.out.println(sum(4));
    }
    public static int reverseInt(int nums){
        int newnum =0;
        while (nums > 0){
            int x =nums%10;
            newnum =newnum * 10 +x ;
            nums =nums/10;

        }
        return newnum;
    }
    public static int maximumNumber(int [] num){
        int l=0;
        for(int r=1;r<num.length;r++){
            if(num[l] <num[r]){
                l=num[r];
            }
        }
        return num[l];
    }
    public static int[] margeTwosortedArr(int nums1[], int nums2[]){
        int l=0;
        int r=0;
        int newArray[]=new int[nums1.length +nums2.length];
        int count =0;
        while (l<nums1.length && r <nums2.length){
            if(nums1[l] < nums2[r]){
                newArray[count]=nums1[l];
                count++;
            }else {
                newArray[count]=nums2[r];
                r++;
                count++;
            }
        }
        while (l <nums1.length){
            newArray[count]=nums1[l];
            l++;
            count++;
        }
        while (r<nums2.length){
            newArray[count]=nums2[r];
            r++;
            count++;
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i] + " ");
        }
        return newArray;
    }
    public static void margeNumber (int nums3 [], int nums4 [], int m, int n){
        int l=n-1;
        int r=m-1;
        int ans = m+n-1;
        while (l >= 0) {
            if (l >= 0 && nums3[l] < nums4[r]) {
                nums3[ans] = nums3[l];
                l--;
            }else{
                nums3[ans]=nums4[r];
                r--;
            }
            ans--;
        }

    }
    public static List<Integer> duplicateValues(int nums []){
        HashMap<Integer, Integer> map =new HashMap<>();
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer ,Integer> ans :map.entrySet()){
            if(ans.getValue() > 1){
                list.add(ans.getKey());
            }
        }
        return list;
    }
    public static void moveZeros (int nums[]){
        int l=0;
        int r=0;
        while (r<nums.length){
            if(nums[r]  != 0){
                int temp =nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + "");
        }

    }
    public static int maximumSum(int nums []){
        int sum =0;
        int maxSum =0;
        for(int i=0;i<nums.length;i++){
            sum =Math.max(nums[i], sum+nums[i]);
            maxSum=Math.max(sum , maxSum);
        }
        return maxSum;
    }
    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }


}
