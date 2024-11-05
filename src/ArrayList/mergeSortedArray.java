package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class mergeSortedArray {
    public static void main(String[] args) {
        int [] nums1={1, 2, 3, 0, 0, 0}, nums2={2, 5, 6};
        int m=3, n=3;
        merge(nums1,m,nums2,n);
    }
    public static void merge (int[] nums1, int m, int[] nums2, int n){
        int p1 =m-1; // that is point to 3-1=2; 2no index of num1
        int p2 =n-1; //that is point to 3-1 =2 ;2 no index of num2
        int list =m+n-1; // m+n-1 length of array

        while(p2 >= 0){
            if(p1 >=0 && nums1[p1] >nums2[p2]){
                nums1[list]=nums1[p1];
                p1--;
            }else{
                nums1[list]=nums2[p2];
                p2--;
            }
            list--;
        }


    }
}
