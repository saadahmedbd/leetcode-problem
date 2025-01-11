package basic_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class higest_lowest_element {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,3,4,2,3};
        higest_lowest_element(nums);
    }
    public static void higest_lowest_element(int[] nums){
        HashMap<Integer, Integer> map=new HashMap<>();
//        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        int maxfreq=0, minfreq=0;
        int maxelem=0, minelem=0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            int count =entry.getValue();
            int elem=entry.getKey();

            if(count >maxfreq){
                maxelem=elem;
                maxfreq=count;
            }
            if(count < minfreq){
                minelem=elem;
                minfreq=count;
            }

        }
        System.out.println(maxelem);
        System.out.println(minelem);
    }
}
