package new_array_hard;

import java.util.*;

public class four_sum {
    public static void main(String[] args) {
        int nums[] ={1000000000,1000000000,1000000000,1000000000};
        int target=0;
        System.out.println(sum_4(nums, target));
        System.out.println(four_sum(nums, target));
        System.out.println(optimal_four_sum(nums,target));
    }
    public static List<List<Integer>> sum_4 (int [] nums, int target){
        HashSet<List<Integer>> set =new HashSet<>();
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        if(nums[i] + nums[j] +nums[k]+nums[l] == target){
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            list.sort(null);
                            set.add(list);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
//    better solution
    public static List<List<Integer>> four_sum (int[] nums, int target){
        HashSet<List<Integer>> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < nums.length; k++) {
                    // taking bigger data type
                    // to avoid integer overflow:
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long four = target - sum;
                        if(hashset.contains(four)){
                            List<Integer> list=Arrays.asList(nums[i], nums[j], nums[k], (int)four);
//                            list.add(nums[i]);
//                            list.add(nums[j]);
//                            list.add(nums[k]);
//                            list.add((int) four);
                            list.sort(null);
                            set.add(list);

                    }
                    // put the kth element into the hashset:
                    hashset.add((long) nums[k]);
                }

            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
//    optimal approach
    public static List<List<Integer>> optimal_four_sum(int [] nums, int target){
       List<List<Integer>> ans =new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           if(i > 0 && nums[i] == nums[i-1]) continue;

           for(int j=i+1;j<nums.length;j++){
               if(j > i+1 && nums[j] == nums[j-1]) continue;

               int k=j+1;
               int l=nums.length-1;
               while (k<l){
                   long sum=nums[i] + nums[j] + nums[k] + nums[l];
                   if(sum == target){
                       List<Integer> list=new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[k]);
                       list.add(nums[l]);
                       ans.add(list);
                       l--;
                       k++;
                       while(k<l && nums[l] == nums[l+1]) l--;
                       while (k<l && nums[k] == nums[k-1]) k++;
                   }else if(sum < target){
                       k++;
                   }else{
                       l--;
                   }
               }
           }
       }
       return ans;

    }

}
