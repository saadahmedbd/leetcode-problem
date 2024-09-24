package famous_Algorithm;

public class Maximum_product_subarray {
    public static void main(String[] args) {
        int [] nums ={-2, 0, -1};
        System.out.println(maximumProductSubarray(nums));

    }
    public static  int maximumProductSubarray(int [] nums){
        int maxSum =nums[0];
        int currSum =1;
        for(int i=0;i<nums.length;i++){
          //  currSum =Math.max(currSum, 1);
            currSum *= nums[i];
            maxSum =Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
