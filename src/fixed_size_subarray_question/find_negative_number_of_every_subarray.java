package fixed_size_subarray_question;

import java.util.ArrayList;
import java.util.List;

public class find_negative_number_of_every_subarray {
//    find second negative number
    public static void main(String[] args) {
        int nums[]={2, 3, -1, 4, -2, 6, 3};
        int k=3;
        System.out.println(negative_subarray(nums, k));
    }
   //sc=0(n)
   //tc=0(n/k)
    public static List<Integer> negative_subarray(int[] nums, int k){
        List<Integer> list =new ArrayList<>();
        int l=0, r=0;
        while(r<nums.length){
            if(r-l+1 <k){
                r++;
            }else if(r-l+1 == k){
                for(int i=l;i<=r;i++){
                    if(nums[i] < 0){
                        list.add(nums[i]);
                        break;
                    }
                }
                l++;
                r++;
            }
        }
        return list;
    }
}
