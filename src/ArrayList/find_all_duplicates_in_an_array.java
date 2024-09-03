package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_all_duplicates_in_an_array {
    public static void main(String[] args) {
        int[]nums={1,1,2};
        System.out.println(findDuplicate(nums));

    }
    public static List<Integer> findDuplicate(int[] nums){
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(0, nums[i]) +1);
            }else{
                map.put(nums[i], 1);
            }
        }
        List<Integer> list= new ArrayList<>();
        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            if(item.getValue() >=2){
                list.add(item.getKey());
            }
        }

        return list;
    }

}
