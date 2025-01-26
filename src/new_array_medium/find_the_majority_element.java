package new_array_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class find_the_majority_element {
    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
    public static int majority(int nums[]){
        HashMap<Integer, Integer> map=new HashMap<>(); //store array of value in hashmap
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> ans:map.entrySet()){
            if(ans.getValue()> nums.length/2){ //if value gathers then n/2 then return key
                return ans.getKey();
            }
        }
        return 0;
    }
}
