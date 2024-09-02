package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Top_K_frequent_element {
    public static void main(String[] args) {
        int [] nums ={1,1,1, 2, 2, 3};
        int k =2;
        System.out.println(topKFrequent(nums,k));

    }
    public static int[] topKFrequent (int[] nums, int k){
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i] ,0)+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        // create list and store map key in list
        List <Integer> list =new ArrayList<>(map.keySet());
        // sort list
        list.sort((a,b)-> map.get(b)-map.get(a));
        int [] res =new int[k];
        for(int i=0;i<k;++i){
            res[i]= list.get(i);
        }
        return res;
    }
}
