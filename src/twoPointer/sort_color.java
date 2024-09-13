package twoPointer;
//asked by facebook
public class sort_color {
    public static void main(String[] args) {
        int [] nums={2, 0, 2, 1, 1,0};
        sortColor(nums);

    }
    public static void sortColor(int [] nums){
        // using 3 pointer
        int left =0;
        int right =nums.length-1;
        int mid=0;
        while(mid<=right){
            if(nums[mid]==0){
                int temp =nums[mid];
                nums[mid]=nums[left];
                nums[left] =temp;
                nums[mid]=nums[right];
                left++;
                mid++;
            } else if (mid==2) {
                int temp=nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;

            }else if(mid==1){
                mid++;
            }
        }
    }
}

