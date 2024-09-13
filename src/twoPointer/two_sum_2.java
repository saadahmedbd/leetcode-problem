package twoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//asked by amazon leetcode 167
public class two_sum_2 {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;
        System.out.println(twosum2(nums, target));

    }
    public static int[] twosum2(int[] nums, int target){
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int miniusValue =target -nums[i];
            if(map.containsKey(miniusValue)){
                return new int[]{ map.get(miniusValue)+1,i+1};  // index increase one
            }else{
                map.put( nums[i],i+1);
            }
        }
        return new int[]{};
    }



}
