package new_binary_search_1D_array;

public class search_in_rotate_array {
    public static void main(String[] args) {
        int nums [] ={4,5,6,7,0,1,2,3};
        int target=0;
        System.out.println(rotateArray(nums, target));

    }
    public static int rotateArray(int nums[], int target){
        int start =0;
        int end =nums.length-1;
        while (start <=end){
            int mid =(start + end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > nums[start]){
                if(nums[start] <= target && target < nums[mid]){
                    end =mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if(nums[end] >= target && target > nums[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
