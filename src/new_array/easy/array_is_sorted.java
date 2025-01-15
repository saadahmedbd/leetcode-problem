package new_array.easy;

import java.util.Arrays;

public class array_is_sorted {
    public static void main(String[] args) {
        int nums[]={ 3,4,5, 1, 2};
        System.out.println(array_sorted(nums));
        System.out.println(sorted_or_rotated(nums));

    }
//    it's code for entire array sorted or not , it's not for rotated array
    public static boolean array_sorted(int nums[]){
        int n=nums.length;
        int value=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i] >= value){
                value=nums[i];
            }else{
                return false;
            }
        }
        return true;
    }
//    leetcode 1752
    public static boolean sorted_or_rotated(int nums[]){
        int n=nums.length;
        int count =0;
        for(int i=0;i<n;i++){
//            check count
            if(nums[i] > nums[(i+1) % n]){  //nums[0] > nums[(0+1)%5)= 3 > 3 not correct so count do not increase
                count++;
            }
//            if count is bigger than 1 then ans will be false
            if(count >1){
                return false;
            }
        }
        return true;
    }
}
