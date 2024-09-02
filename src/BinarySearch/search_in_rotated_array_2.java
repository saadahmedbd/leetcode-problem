package BinarySearch;
//81. Search in Rotated Sorted Array II
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
//nums =
    //    [1,0,1,1,1]
public class search_in_rotated_array_2 {
    public static void main(String[] args) {
        int[] nums ={2, 5, 6, 0,0,1, 2};
        int target =0;
        System.out.println(sortedArray2(nums, target));

    }
    public static boolean sortedArray2(int[] nums, int target){
        int start =0;
        int end =nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return true;
            // if start element , mid element and end element equal to than use this line of code
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start =start+1;
                end =end-1;
                continue;
            }
            // this code as rotate array question
            if(nums[mid] >=nums[start]){
                if(nums[mid] >target && nums[start]<= target){
                    end =mid -1;
                }else{
                    start =mid +1;
                }
            }else{
                if(nums[mid] < target && target <= nums[end]){
                    start =mid +1;
                }else {
                    end =mid -1;
                }
            }
        }
        return false;
    }
}
