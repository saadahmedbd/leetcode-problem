package ArrayList;

import java.util.HashMap;

public class largest_subarray_with_0_sum {
    public static void main(String[] args) {
        int [] nums={1, 2, 4, 5, -1, -1};
        System.out.println(largest_subarray(nums));

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
}
