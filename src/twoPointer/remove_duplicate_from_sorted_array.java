package twoPointer;

public class remove_duplicate_from_sorted_array {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));

        System.out.println(remove_duplicate(nums));

    }
    public static int removeDuplicate(int[] nums){
        int l=0;
        int r=0;
        while(r<nums.length){


            if(nums[l] == nums[r]){
                r++;
            }else{
                l++;
                nums[l]=nums[r];
                r++;
            }
        }
        return l+1;
    }
    public static int remove_duplicate(int[] nums){
        int l=1;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[r-1]){
                nums[l]=nums[r];
                l++;

            }
        }
        return l;
    }

}
