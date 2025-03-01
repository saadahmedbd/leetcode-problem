package new_binary_search_on_ans;

public class k_th_missing_positive_number {
    public static void main(String[] args) {
        int nums [] ={2,3,4,7,11};
        int k=5;
        System.out.println(missingNumber(nums, k));
        System.out.println(missing(nums, k));
    }
    public static int missingNumber(int nums [], int k){
        for (int i=0;i<nums.length;i++){
            if(nums[i] <= k){
                k++;
            }else {
                break;
            }
        }
        return k;
    }
    public static  int missing(int nums [], int k){
        int low=0, high=nums.length-1;
        while (low <= high){
            int mid =(low+high)/2;
            int missing =nums[mid] -(mid+1);
            if(missing < k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low+k;
    }
}
