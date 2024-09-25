package famous_Algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_element {
    public static void main(String[] args) {
        int [] nums ={2,2,3};
        System.out.println(majorityElement2(nums));
       // System.out.println(majorityElement(nums));
        System.out.println(majorityElement3(nums));

    }
    //this solution only passed 31 out of 50
    public static int majorityElement(int [] nums){
        Arrays.sort(nums);
        int left =0;
        int length =0;
        for(int right =0;right<nums.length-1;right++){
            if(nums[left]==nums[right]){
                length =Math.max(length, right-left+1);

            }else{
                left=right;
            }


        }

        return nums[length];

    }

    //hashmap that is great ans
    //o(n)
    public static int majorityElement2(int nums[]){
        int n=nums.length;
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        for(int key :map.keySet()){
            if(map.get(key) >n/2){
                return key;
            }
        }
        return 0;
    }
    public static int majorityElement3(int nums[]){

        //boyer-moore-voting algorithms
        //tc 0(n) sc(1)
        //asked by amazon
        int count =0, majorityElement =0;
        for(int i=0;i<=nums.length-1;i++){
            if (count == 0){
                majorityElement =nums[i];
            } if(majorityElement ==nums[i]){
                count ++;
            }else{
                count --;
            }
        }
        return majorityElement;

    }
}
