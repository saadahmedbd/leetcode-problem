package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class remove_element {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2};
        int val = 3;
       //    System.out.println(remove(nums,val));
        System.out.println(remove(nums,val));

    }

    public static int remove(int[] nums, int val) {
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=val){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;

    }
}
