package new_array_hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_majority_element {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(majority_element(nums));
    }
    public static List<Integer> majority_element(int [] nums){
        HashMap<Integer, Integer> map =new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> result :map.entrySet()){
            if(result.getValue() > nums.length/3){
                ans.add(result.getKey());
            }
        }
        return ans;
    }
}
