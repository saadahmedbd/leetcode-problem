package basic_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class count_number {
    public static void main(String[] args) {
        int nums[]={1, 5, 6, 1, 2, 4, 5};
//        System.out.println(count(nums));
        count(nums);
    }
    public static void count(int [] nums){
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else {
                map.put(nums[i], 1);
            }
        }
//        for(int value :map.values()){
//            list.add(value);
//        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        return list;
    }
}
