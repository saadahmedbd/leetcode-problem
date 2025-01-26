package new_array_medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leader_in_an_array {
    public static void main(String[] args) {
        int nums[]={10,22,12,3,0,6};
        System.out.println(leaderArray(nums));
        System.out.println(leader(nums));
    }
    public static List<Integer> leaderArray(int[] nums){
//        brutch force approach
        List<Integer> ans=new ArrayList<>();
        int n= nums.length;
        for(int r=0;r<n;r++){
            boolean leader=true;
            for(int j=r+1;j<n;j++){
                if(nums[j] >nums[r]){
                    leader=false;
                    break;
                }

            }
            if(leader){
                ans.add(nums[r]);
            }

        }
        return ans;
    }
    public static List<Integer> leader(int nums[]){
//        optimal approach
        int max=Integer.MIN_VALUE;
        List<Integer> ans= new ArrayList<>();
        for(int r= nums.length-1;r>0;r--){
            if(nums[r]> max){
                max=nums[r];
                ans.add(max);
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        return ans;
    }
}
