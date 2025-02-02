package new_array_hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_the_repeating_and_missing_numbers {
    public static void main(String[] args) {
        int [] nums={3,1,2,5,4,6,7,5};
        System.out.println(repeating_missing_number(nums));
        System.out.println(missing_repeating(nums));
    }
    public static int []repeating_missing_number(int nums[]){
        int missing =-1;
        int occurence =-1;
        for(int i=1;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count != 0) occurence=i;
            else if (count == 0) missing=i;

            if (occurence != -1 && missing != -1)
                break;
        }
        int [] ans ={occurence, missing};
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }
        return ans;



    }
//    better approach
    // tc 0(n) sc 0(n)
    public static List<Integer> missing_repeating(int [] nums){
        List<Integer> ans =new ArrayList<>();
        // code here

        int n=nums.length;
        int [] hash =new int [n+1];// hash store occurrence of number default [0 n time] [0, 0, 0, 0, 0, 0, 0,0]
        for(int i=0;i<n;i++){
            hash[nums[i]]++; // if number is find this array then default hash increase by one
        }
        int repeating =-1;
        int missing =-1;
        for(int i=1;i<=n;i++){
            if(hash[i] == 0){
                missing =i; // if hash[i] is had o occurrence index than missing index we will find
            }else if (hash[i] == 2){
                repeating =i; // or we found repeating index
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        ans.add(repeating);
        ans.add(missing);
        return ans;

    }
}
