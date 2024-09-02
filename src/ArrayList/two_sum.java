package ArrayList;

import java.util.HashMap;
//0(n)
//leetcode 1, asked by google

public class two_sum {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target =9;
        System.out.println(twoSum(nums, target));

    }
    public static int[] twoSum(int [] nums, int target){
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int minius =target -nums[i];
            if(map.containsKey(minius)){
                return new int []{i, map.get(minius)};
            }else{
                map.put(nums[i], i);
            }
        }


        return new int[]{};
    }
}
