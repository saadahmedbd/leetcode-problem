package new_array_medium;

public class sort_colour_0_1_2 {
    public static void main(String[] args) {
        int [] nums={2, 0, 2, 1,1, 0};
        sort_colour(nums);
    }
    //sort color means an array sort like first 0 then 1 and 2
    public static void sort_colour(int [] nums){
            int l=0, r=nums.length-1, mid=0;
            while(mid<=r){
                if(nums[mid] == 0){ //if we find mid =0 then swap to left position
                    int temp=nums[mid];
                    nums[mid]=nums[l];
                    nums[l]=temp;
                    l++;
                    mid++;

                }else if(nums[mid] == 2){ //if we find mid = 2 then swap the right position
                    int temp=nums[mid];
                    nums[mid]=nums[r];
                    nums[r]=temp;
                    r--;
                }else if(nums[mid] ==1) { //if we find mid =0 then we can't swap
                    mid++;

                }
            }
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
    }
}
