package new_array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class union_0f_two_array {
    public static void main(String[] args) {
        int [] nums1={1,2,3,4,5,6,7,8,9,10};
        int nums[]={2,3,4,4,5,11,12};
        int n=10, m=7;
        System.out.println(union(nums1, nums, n, m));
    }
    public static List<Integer> union(int[] nums1, int[] nums, int n, int m){
        Set<Integer> set =new HashSet<>();
        List<Integer> anss=new ArrayList<>();
        for(int i=0;i<n;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(nums[i]);
        }
        for(int result :set){
            anss.add(result);
        }
        return anss;
    }
}
