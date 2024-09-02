package BinarySearch;

public class find_minimum_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0};
        System.out.println(find_minimum(nums));
        System.out.println(find_minimum2(nums));
    }

    public static int find_minimum(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //base case
        if(nums.length==1) return nums[left];
        if(nums.length==2) return Math.min(nums[0],nums[1]);
        if(nums[0]<nums[nums.length-1]) return nums[0];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid+1]< nums[mid]){
                return nums[mid+1];
            }if (nums[mid]<nums[mid-1]) return nums[mid];
            if(nums[mid]>nums[left]){
                left =mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }

    //solving techning 2
    public static int find_minimum2(int[] nums){
        int start =0;
        int end =nums.length-1;
        while (start<end){
            int mid =start+(end-start)/2;
            if(nums[mid]<nums[end]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return nums[start];
    }
}