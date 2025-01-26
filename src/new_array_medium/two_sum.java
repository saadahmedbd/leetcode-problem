package new_array_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class two_sum {
    public static void main(String[] args) {
        int nums[]={2,6,5,8,11};
        int target=14;
        System.out.println(twoSum(nums, target));
    }
    public static int[] twoSum(int nums[], int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int divide = target - nums[i];
            if(map.containsKey(divide)){  //if an array of value and subtract value are same
                return new int []{i, map.get(divide)}; // return array of value index and subtract value index
            }else{
                map.put(nums[i], i); //store array of value and index
            }
        }
        return new int[]{};
    }
}
