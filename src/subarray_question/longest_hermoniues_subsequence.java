package subarray_question;

import java.util.Arrays;

//We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
//
//Given an integer array nums, return the length of its longest harmonious
//subsequence
// among all its possible subsequences
//594
//tc=0(nlogn)
//sc=0(1)

public class longest_hermoniues_subsequence {
    public static void main(String[] args) {
    int[] nums={1,2,3,4};
        System.out.println(hermonius_subsequence(nums));
    }
    public static int hermonius_subsequence(int[] nums){
        int l=0;
        int r=0;
        Arrays.sort(nums);
        int ans=0;
        while(r<nums.length){
            while (nums[r] -nums[l] >1){
                l++;
            }
            if(nums[r]-nums[l] ==1){
                ans=Math.max(ans, r-l+1);
            }
            r++;
        }
        return ans;
    }
}
