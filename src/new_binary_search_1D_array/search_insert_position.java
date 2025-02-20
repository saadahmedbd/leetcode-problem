package new_binary_search_1D_array;

public class search_insert_position {
    public static void main(String[] args) {
        int nums []={1,3,5,6};
        int target =7;
        System.out.println(searchInsertPosition(nums, target));
    }
    public static int searchInsertPosition(int nums [], int target){
        int start =0;
        int end =nums.length-1;
        while (start <= end){
            int mid =(end +start)/2;
            if(nums[mid] > target ){
                end =mid-1;
            }else if(nums[mid] <target){
                start =mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
