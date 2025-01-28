package new_array.easy;

import java.util.HashMap;

public class longest_subarray_of_sum_with_negative_number {
    public static void main(String[] args) {
        int nums[]={1, 0, -5};
        int k=0;
        System.out.println(longest_subarray_sum_of_negative_number(nums,k));
    }
    public static int longest_subarray_sum_of_negative_number(int nums[], int k){
        HashMap<Integer, Integer> map =new HashMap<>();
        int prefixSum=0, length=0;
        int maxlen=0;

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum == k){
                maxlen=Math.max(maxlen, i+1);
            }
            int remove=prefixSum-k;
            if(map.containsKey(remove)){
                length=i-map.get(remove);
                maxlen=Math.max(maxlen, length);
            }
            if(!map.containsKey(remove)){
                map.put(prefixSum, i);

            }
        }
        return maxlen;
    }
}
