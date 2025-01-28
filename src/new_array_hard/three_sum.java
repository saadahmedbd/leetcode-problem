package new_array_hard;

import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(sum_of_three(nums));
        System.out.println(threeSum(nums));
        System.out.println(optimalThreeSum(nums));
    }
//    brute force
    public static List<List<Integer>> sum_of_three(int [] nums){
        HashSet<List<Integer>> set =new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
//    better solution hashset
    public static List<List<Integer>> threeSum (int [] nums){
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set1=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i] +nums[j]);
                if(set1.contains(third)){
                    List<Integer> temp =Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
                set1.add(nums[j]);



            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
//    optimal approach
    public static List<List<Integer>> optimalThreeSum(int [] nums){
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!= 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                int sum=nums[i] + nums[j] + nums[k];
                if(sum <0){
                    j++;
                }else if(sum >0){
                    k--;
                }else{

                    List<Integer> temp =Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
//                skip the duplicate
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while (j<k && nums[k] == nums[k+1]) k--;
                }


            }
        }
        return ans;
    }
}
