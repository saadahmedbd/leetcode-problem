package new_array_medium;

public class kadens_algorthims_max_sum {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max_sum(nums));

    }
    public static int max_sum(int nums[]){
        int maxSum =nums[0];
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum=Math.max(nums[i], current_sum+nums[i]);
            maxSum=Math.max(current_sum, maxSum);
        }
        return maxSum;
    }


}
