package Job_preparation;

public class floor_ceil {
    public static void main(String[] args) {
        int nums[] ={2,3,7, 9, 10, 12};
        int target=11;
        System.out.println(floor(nums, target));
        System.out.println(ceil(nums, target));
    }
    public static int floor(int nums [], int target){
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MIN_VALUE;
        while (low <= high){
            int mid=(low+high)/2;
            if(nums[mid] <= target){
                ans=Math.max(ans, nums[mid]);
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public  static int ceil (int nums[], int target){
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while (low <= high){
            int mid=(low+high)/2;
            if(nums[mid] <= target){

                low=mid+1;
            }else{
                ans=Math.min(ans, nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
