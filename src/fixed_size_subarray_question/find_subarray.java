package fixed_size_subarray_question;

import java.util.ArrayList;
import java.util.List;

public class find_subarray {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,3};
        System.out.println(findSubarray(nums));
    }
    public static int findSubarray(int nums[]){
        int l=0;
        int r=0;
        int count=0;
        int ans=0;
        List<Integer> list=new ArrayList<>();
        while(l<nums.length){
            while (r<nums.length){
                count++;
                r++;
            }
            l++;
            r=l;


        }
        return count;

    }
}
