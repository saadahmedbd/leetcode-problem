package new_array.easy;

import java.util.HashMap;
import java.util.Map;

public class Find_the_number_that_appears_once {
    public static void main(String[] args) {
        int nums[]={4,2,1,2,1};
        System.out.println(findTheNumber_that_appears_once(nums));
    }
    public static int findTheNumber_that_appears_once(int [] nums){
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else{
                map.put(nums[i], 1);
            }
        }
       for(Map.Entry<Integer, Integer> ans: map.entrySet()){
           if(ans.getValue() == 1){
               return ans.getKey();
           }
       }
        return 0;
    }
}
