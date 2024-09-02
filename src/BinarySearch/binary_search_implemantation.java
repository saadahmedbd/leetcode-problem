package BinarySearch;

public class binary_search_implemantation {
    public static void main(String[] args) {
        int[] nums ={1,2, 3, 4, 5, 6};
        int target =6;
        System.out.println(binary_search(nums, target));
    }
    public static int binary_search(int nums[], int target){
        int start =0;
        int end =nums.length-1;
        while(start<= end){
            int mid = start+(end - start)/2;
            if(nums[mid] >target){
                end =mid -1;
            }else if (nums[mid]<target){
                start =mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
