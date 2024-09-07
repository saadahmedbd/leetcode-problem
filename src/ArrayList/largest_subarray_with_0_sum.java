package ArrayList;

import java.util.HashMap;

public class largest_subarray_with_0_sum {
    public static void main(String[] args) {
        int [] nums={1,3, 4, -4, -1, 3, 4};
        System.out.println(largest_subarray(nums));
        System.out.println(subarray_sum_0(nums));

    }
    public static int largest_subarray(int nums[] ){
        int n=nums.length-1;
        int sum =0 , len =0;
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum ==0){
                len =i+1;
            }else if(map.containsKey(sum)){
                len =Math.max(len, i- map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return len;
    }
    public static int subarray_sum_0(int [] nums){
        int length=0;
        int sum=0;
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            sum += nums[i];
            if(sum == 0){
                length=i+1;
            }else if(map.containsKey(sum)){
                length=Math.max(length, i- map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return length;
    }
}
