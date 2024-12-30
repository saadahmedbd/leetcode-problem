package fixed_size_subarray_question;

import java.util.HashMap;
//992. Subarrays with K Different Integers

public class find_k_different_integer {
    public static void main(String[] args) {
        int [] nums={1,2,1,2,3};
        int k=2;
        System.out.println(findKDifferentNumber(nums, k));
    }
    public static int findKDifferentNumber(int nums[], int k){
       return  slindingWindowAtMost(nums, k) - slindingWindowAtMost(nums, k-1);
    }
    public static int slindingWindowAtMost(int nums[], int distinct){
        //create hashmap
        HashMap<Integer, Integer> map =new HashMap<>();
        int left=0, count=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            while(map.size()>distinct){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count += (right-left+1);
        }
        return count;
    }
}
