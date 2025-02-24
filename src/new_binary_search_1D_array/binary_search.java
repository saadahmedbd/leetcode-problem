package new_binary_search_1D_array;

public class binary_search {
    public static void main(String[] args) {
        int nums [] ={2,3,4,5,6,7};
        int target =6;
        System.out.println(binarySearch(nums, target));
    }
    public static int binarySearch(int nums [], int target){
        int start =0;
        int end =nums.length-1;
        while (start <= end){
            int mid =(start + end)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end =mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
