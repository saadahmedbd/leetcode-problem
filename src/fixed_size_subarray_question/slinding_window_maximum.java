package fixed_size_subarray_question;

public class slinding_window_maximum {
    public static void main(String[] args) {
        int [] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(findMax(nums));
        System.out.println(findMaximum(nums,k));
    }
    public static int findMax(int nums[]){
        int ans=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans=nums[i];
            }
        }
        return ans;
    }
    public static int[] findMaximum(int [] nums, int k){
        int n=nums.length;
        int [] ans=new int[n-k+1];
        int l=0;
        int r=0;
        while(r<n){
            if(r-l+1 <k){
                r++;
            }else if(r-l+1 == k){
                int maxValue=nums[l];
                for(int i=l+1;i<=r;i++){
                    if(nums[i] >maxValue){
                        maxValue=nums[i];
                    }
                }
                ans[l]=maxValue;
                l++;
                r++;
            }
        }
        return ans;
    }
}
