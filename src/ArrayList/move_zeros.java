package ArrayList;
//
public class move_zeros {
    public static void main(String[] args) {
        int nums[] ={0,1,0,12,13};
        //System.out.println(zeros(nums));
        zeros(nums);
        int val=0;
        remove(nums,val);
    }
    public static void zeros(int[] nums){
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                int temp=nums[l];
                nums[l] =nums[r];
                nums[r]=temp;
                l++;
            }
        }
        //return nums;
    }
    public static void remove(int[] nums, int val) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            if (nums[l] != val) {
                l++;
            } else if (nums[r] == val) {
                r--;
            } else if (nums[l] == val) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
    }
}
