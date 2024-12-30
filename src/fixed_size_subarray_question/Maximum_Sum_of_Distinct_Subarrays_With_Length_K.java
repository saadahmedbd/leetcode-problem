package fixed_size_subarray_question;

import java.util.HashMap;
import java.util.HashSet;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {
    public static void main(String[] args) {
        int nums[]={1,5,4,2,9,9,9};
        int k=3;
        System.out.println(distinct_max_sum(nums,k));
        System.out.println(distinct_subarray_maximum(nums,k));

    }
    public static long distinct_max_sum(int nums[], int k){
        HashMap<Integer, Integer> map =new HashMap<>();
        int l=0;
        long sum =0;
        long ans=0;
        for(int r=0;r<nums.length;r++){
            sum =sum +nums[r];

            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);

            if(r-l+1 == k){
                if(map.size() == k){
                    ans=Math.max(ans, sum);
                }
                sum =sum -nums[l];
                map.put(nums[l], map.get(nums[l])-1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }


        }
        return ans;

    }
    //hashset solution
    public static  long distinct_subarray_maximum(int [] nums, int k){
        HashSet<Integer> set =new HashSet<>();
        int l=0;
        long sum =0;
        long ans=0;
        for(int r=0;r<nums.length;r++){
            if(!set.contains(nums[r])){
                sum +=nums[r];
                set.add(nums[r]);

                if(r-l+1 == k){
                    ans=Math.max(sum, ans);
                    sum -=nums[l];
                    set.remove(nums[l]);
                    l++;

                }
            }else {
                while(nums[l] != nums[r]){
                    sum -= nums[l];
                    set.remove(nums[l]);
                    l++;
                }
                l++;
            }

        }
        return ans;
    }
}
