package new_array_hard;

import java.util.HashMap;

public class Largest_subarray_with_0_sum {
    public static void main(String[] args) {
        int [] arr={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(longest_subarray(arr));
    }
    public static int longest_subarray(int [] arr){
        HashMap<Integer, Integer> map =new HashMap<>();
        int maxlen=0;
        int sum=0;
        int length=0;
        int i;
        for(i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum ==0){
                maxlen =Math.max(maxlen, i+1);
            }
            int remaing =sum -0;
            if(map.containsKey(remaing)){
                length=i-map.get(remaing);
                maxlen=Math.max(maxlen, length);
            }
            if(!map.containsKey(remaing)){
                map.put(sum, i);
            }
        }
        return maxlen;
    }
}
