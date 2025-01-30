package new_array_hard;

import java.util.HashMap;

public class Count_the_number_of_subarrays_with_given_xor_K {
    public static void main(String[] args) {
        int [] nums={4, 2, 2, 6, 4};
        int k=6;
        System.out.println(count_subarray_of_xor(nums, k));
    }
    public static int count_subarray_of_xor(int [] nums, int k){
//        same as count subarray of giving k
        HashMap<Integer, Integer> map=new HashMap<>();
        int xorSum=0;
        int count =0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            xorSum ^= nums[i];
            int remove =xorSum ^ k;
            if(map.containsKey(remove)){
                count += map.get(remove);
            }
            map.put(xorSum, map.getOrDefault(xorSum, 0)+1);
        }
        return count;
    }

}
