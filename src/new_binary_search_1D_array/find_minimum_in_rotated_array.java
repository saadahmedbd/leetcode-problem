package new_binary_search_1D_array;

public class find_minimum_in_rotated_array {
    public static void main(String[] args) {
        int nums [] = {11,12,15,17};
        System.out.println(findMinimum(nums));
        System.out.println(findMinimum2(nums));
    }
    public static int findMinimum(int nums []){
        int start =0;
        int end =nums.length-1;
        int ans =Integer.MAX_VALUE;
        while (start <=end){
            int mid =(start + end)/2;
            if(nums[mid] >= nums[start]){
                ans =Math.min(nums[start], ans);
                start =mid+1;
            }else{
                ans =Math.min(nums[mid], ans);
                end =mid+1;
            }
        }
        return ans;
    }
//    solution 2
    public static  int findMinimum2 (int nums[]){
        int start=0;
        int end =nums.length-1;
        while (start < end){
            int mid=(start + end)/2;
            if(nums [mid] < nums[end]){
                end =mid;
            }else {
                start =mid+1;
            }
        }
        return nums[start];
    }
}
