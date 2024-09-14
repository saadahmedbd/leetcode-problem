package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public static void main(String[] args) {
        int nums[] ={-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0;i<=nums.length-3;i++){
            if(i ==0 || nums[i] != nums[i-1]){

                int l=i+1;
                int r=nums.length-1;
                int target =0-nums[i];
                while (l<r){
                    if (nums[l] +nums[r] == target) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[l]);
                        triplet.add(nums[r]);
                        triplets.add(triplet);

                        while(l<nums.length-1 && nums[l] ==nums[l+1] )l++;
                        while (r>0 && nums[r]==nums[r-1]) r--;
                        r--;
                        l++;

                    }else if(nums[l] +nums[r] <target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return triplets;
    }
}
