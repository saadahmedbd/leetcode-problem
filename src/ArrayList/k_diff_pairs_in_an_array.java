package ArrayList;

import java.util.HashMap;
import java.util.Map;
//amazon leetcode 532

public class k_diff_pairs_in_an_array {
    public static void main(String[] args) {
        int[] nums={3,1,4,1,5};
        int K=2;
        System.out.println(K_diff_pair(nums, K));

    }
    public static int K_diff_pair(int[] nums, int K){
        // using hashmap time o(n)
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int num :nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int count =0;
        for(Map.Entry<Integer, Integer> item: map.entrySet()){
            if(K==0){
                if(item.getValue()>=2){
                    count++;
                }
            }else{
                if(map.containsKey(item.getKey()+K)){
                    count++;
                }
            }
        }
        return count;
    }
}
