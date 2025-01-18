package new_array.easy;

import java.util.Arrays;

public class find_missing_element {
    public static void main(String[] args) {
        int nums[]={0,1,2,3,5};
        System.out.println(findMissingElement(nums));
        System.out.println(find_missing(nums));
    }
    public static int findMissingElement(int[] nums){
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid] <= mid){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
    public static int find_missing(int [] nums){
        int n=nums.length;
        int sum=0;
        int missing_sum=0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        for(int i=0;i<n;i++){
            missing_sum += nums[i];
        }
        return sum-missing_sum;
    }
}
