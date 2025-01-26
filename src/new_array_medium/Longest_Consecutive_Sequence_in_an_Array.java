package new_array_medium;

import java.util.Arrays;

public class Longest_Consecutive_Sequence_in_an_Array {
    public static void main(String[] args) {
        int [] nums={100, 200, 1, 3, 2, 4};
        System.out.println(longest_consecutive_sequence(nums));
    }
    public static int longest_consecutive_sequence(int [] nums){
        Arrays.sort(nums);
        int l=0, r=1;
        int count=0;
        int ans=0;
        while(r< nums.length){
            int subtract=nums[r]-nums[l];
            if(subtract==1 || subtract==0){
                count++;

            }else{
                count=0;
            }
           ans=Math.max(count, ans);
            l++;
            r++;
        }
        return ans+1;
    }
}
