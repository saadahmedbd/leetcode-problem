package subarray_question;

public class product_subarray {
    public static void main(String[] args) {
        int[] nums={2,3,1,5,6,-1,3,2};
        System.out.println(maximum_product_subarray(nums));
    }
    // observation solution
    public static int maximum_product_subarray(int nums[]){
       int prefix=1, suffix=1;
       int ans=Integer.MIN_VALUE;
       int n= nums.length;
       for(int i=0;i<n;i++){
           if(prefix == 0) prefix=1;
           if( suffix == 0) suffix =1;
           prefix =prefix * nums[i];
           suffix=suffix * nums[n-i-1];
           ans=Math.max(ans, Math.max(suffix, prefix));
       }
       return ans;
    }
}
