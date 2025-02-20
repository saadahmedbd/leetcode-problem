package new_binary_search_1D_array;

import java.util.ArrayList;
import java.util.List;

public class floor_and_ceil {
    public static void main(String[] args) {
        int nums []={3, 4, 4, 7, 8, 10};
        int target =5;
        System.out.println(floor(nums, target));
        System.out.println(ceil(nums, target));
    }
    public static int floor(int nums[], int target){

        int start =0;
        int end =nums.length-1;
        while (start <=end){
            int mid =(end+start)/2;
            if(nums[mid] < target){
                start=mid+1;
            }else if(nums[mid] > target){
                end =start-1;
            }else {
                return mid;
            }
        }
        return nums[end];

    }
    public static int ceil (int nums [], int target){
        int start =0;
        int end =nums.length-1;
        while (start <=end){
            int mid =(end+start)/2;
            if(nums[mid] < target){
                start=mid+1;
            }else if(nums[mid] > target){
                end =start-1;
            }else {
                return mid;
            }
        }
        return nums[start];
    }
}
