package new_binary_search_1D_array;

public class search_in_rotate_array_two {
    public static void main(String[] args) {
        int nums [] ={4,5,5,6,7,0,0,1,2,3};
        int target =5;
        System.out.println(rotateArryTwo(nums, target));

    }
    public static  int rotateArryTwo(int nums [], int target){
        int start =0;
        int end =nums.length-1;
        while (start <=end){
            int mid =(start + end)/2;
            if(nums[mid] == target) return mid;
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start =start+1;
                end =end-1;
                continue;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target < nums[mid]){
                    end =mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[end] >= target && nums[mid] < target){
                    start =mid+1;
                }else{
                    end =mid-1;
                }
            }
        }
        return -1;
    }
}
