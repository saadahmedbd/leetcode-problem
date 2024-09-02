package BinarySearch;
//33. Search in Rotated Sorted Array asked by facebook

public class Search_in_rotated_array {
    public static void main(String[] args) {
        int[] nums ={4, 5, 6, 7, 8, 0, 1, 2, 3};
        int target =1;
        System.out.println(sorted_array(nums,target));

    }
    public static int sorted_array(int[] nums, int target){
        int first =0;
        int last =nums.length-1;
        while(first <=last){
            int mid =(first+last)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid] >= nums[first]){
                if(nums[mid] >target && target>= nums[first]){
                    last =mid -1;
                }else{
                    first =mid +1;
                }
            }else{
                if(nums[mid] <target && nums[last]>=target){
                    first =mid+1;
                }else{
                    last=mid-1;
                }
            }
        }
        return -1;
    }
}
