package ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//leetcode 217 asked by google

public class contrain_duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1};
        System.out.println(duplicate(nums));
        System.out.println(duplictate_hashset(nums));

    }
    public static boolean duplicate(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
    //techning 2
    public static boolean duplictate_hashset(int [] nums){
        HashSet<Integer> set =new HashSet<>();
        for(int num :nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

}
