package ArrayList;

import java.util.Arrays;

public class first_missing_positive {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        System.out.println(missingPositive(nums));
    }
    public static int missingPositive(int [] nums){
        Arrays.sort(nums);
        int n=1;
        for(int i=0;i<=nums.length-1;i++) {
            if (n == nums[i]) {
                n++;
            }
        }
        return n;
    }
}
//time complexity o(nlogn)
//space complexity 0(1)