package new_binary_search_on_ans;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {
        int nums[] ={8,4,2,3};
        int threshold=10;
        System.out.println(findTheSmallestDivisor(nums, threshold));
    }
    public static int findTheSmallestDivisor(int nums [], int threshold){
        int start =0;
        int end =findMax(nums);
        int ans =Integer.MAX_VALUE;
        while (start <= end){
            int mid =start+(end-start)/2;
            int sum =0;
            for(int i=0;i<nums.length;i++){
                sum += Math.ceil(( double) nums[i]/ mid);
            }
            if(sum >threshold){
                start=mid+1;
            }else if(sum <= threshold){
                end=mid-1;
                ans=Math.min(ans, mid);
            }
        }
        return ans;
    }
    public static int findMax(int nums []){
        int max=0;
        for(int i=0;i<nums.length;i++){
            max =Math.max(max, nums[i]);
        }
        return max;
    }
}
