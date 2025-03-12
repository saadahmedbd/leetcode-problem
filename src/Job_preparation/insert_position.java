package Job_preparation;

public class insert_position {
    public static void main(String[] args) {
        int nums [] ={1, 3, 5, 6};
        int target=7;
        System.out.println(insertPosition(nums, target));
    }
    public static int insertPosition(int [] nums, int target){
        int low=0;
        int high=nums.length-1;
        while (low <=high){
            int mid =(low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
