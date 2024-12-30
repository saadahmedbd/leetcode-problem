package fixed_size_subarray_question;

public class max_sum_of_subarray {
    public static void main(String[] args) {
        int nums[]={1,5,4,2,9,9,9};
        int k=3;
        System.out.println(max_sum(nums,k));
    }
    public static  int max_sum(int nums[], int k){

        int l=0;int r=0;
        int sum=0;
        int ans=0;
        while (r<nums.length){
            if(r-l+1 <k){
                sum =sum + nums[r];
                r++;
            }else if(r-l+1 == k){

                sum=sum+nums[r];
                ans=Math.max(sum, ans);

                sum=sum-nums[l];
                l++;
                r++;
            }

        }
        return ans;

    }
}
