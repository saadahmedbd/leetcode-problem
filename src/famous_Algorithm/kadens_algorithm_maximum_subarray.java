package famous_Algorithm;
//asked by google
//kaden's algrtihms
//leetcode 53
//time complexity 0{n}

public class kadens_algorithm_maximum_subarray{
    public static void main(String[] args) {
        int nums [] ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximum_subarray(nums));

    }
    public static int maximum_subarray(int [] nums){
        int maxSum =nums[0];
        int currSum =0;
        for(int i=0;i<nums.length;i++){
            currSum =Math.max(currSum, 0);
            currSum =currSum +nums[i];
            maxSum =Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
