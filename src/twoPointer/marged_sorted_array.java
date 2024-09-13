package twoPointer;

import java.util.ArrayList;
import java.util.List;

public class marged_sorted_array {
    public static void main(String[] args) {
        int [] nums1={1, 2, 3, 0,0, 0};
        int [] nums2={2, 5, 6};
        int m=3 , n=3;
        merge(nums1, m, nums2, n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        for(int i=nums1.length-1;i>=0;i--){
            int valueAt1 =p1 >=0 ? nums1[p1] : Integer.MIN_VALUE;
            int valueAt2 =p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
            if(valueAt1 < valueAt2){
                nums1[i] =valueAt2;
                p2--;
            }else{
                nums1[i] =valueAt1;
                p1--;
            }
        }
    }
}

