package new_array_medium;

public class sort_colour_0_1_2 {
    public static void main(String[] args) {
        int [] nums={2, 0, 2, 1,1, 0};
        sort_colour(nums);
    }
    public static void sort_colour(int [] nums){
            int l=0, r=nums.length-1, mid=0;
            while(mid<=r){
                if(nums[mid] == 0){
                    int temp=nums[mid];
                    nums[mid]=nums[l];
                    nums[l]=temp;
                    l++;
                    mid++;

                }else if(nums[mid] == 2){
                    int temp=nums[mid];
                    nums[mid]=nums[r];
                    nums[r]=temp;
                    r--;
                }else if(nums[mid] ==1) {
                    mid++;

                }
            }
    }
}
