package new_binary_search_1D_array;

public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) {
        int nums []={2,2,2,0,1};
        System.out.println(find_minimum(nums));
    }
    public static int find_minimum(int [] nums){
        int low=0, high =nums.length-1;
        while(low < high){
            int mid =low+(high-low)/2;
            if(nums[mid]> nums[high]){
                low=mid+1;
            }else if(nums[mid]< nums[low]){
                high=mid;
                low++;
            }else{
                //if array is sorted than apply this condition
                high--;
            }
        }
        return nums[low];
    }


}
