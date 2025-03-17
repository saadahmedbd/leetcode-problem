package new_array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Divide_array_into_equal_pair {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
//        System.out.println(divideArray(nums));
        System.out.println(divide_array(nums));

    }
    public static  boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length/2;
        int l=0;
        int r=1;
        int count=0;
        while(r<nums.length){
            if(nums[l] == nums[r]){
                count++;
                l+=2;
                r+=2;
            }else{
                l++;
                r++;
            }

        }
        return count == len ? true : false;

    }
    public static boolean divide_array(int [] nums){
        HashMap<Integer,Integer> map =new HashMap<>();
        int len =nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int res=0;
        for(Map.Entry<Integer,Integer> ans : map.entrySet()){

            int count =ans.getValue()/2;
            res +=count;
            if(res==len){
                return true;
            }
        }
        return false;
    }
}
