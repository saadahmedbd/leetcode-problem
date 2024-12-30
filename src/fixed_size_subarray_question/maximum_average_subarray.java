package fixed_size_subarray_question;

public class maximum_average_subarray {
    public static void main(String[] args) {
    int nums[]={-1};
    int k=1;
        System.out.println(maximumAverage_subarray(nums,k));
    }
//    leetcode 643
    public static double maximumAverage_subarray(int [] nums, int k){
        int l=0;
        int r=0;
        int  sum=0;
        int ans=Integer.MIN_VALUE;

        while(r<nums.length){
            if(r-l+1 <k){
                sum +=nums[r];
                r++;
            }

            else if(r-l+1 == k){

                sum += nums[r];
//                sum=sum/k;
                ans=Math.max(ans,sum);

                sum -=nums[l];
                l++;
                r++;
            }
        }
        return (double) ans/k;
    }
}
