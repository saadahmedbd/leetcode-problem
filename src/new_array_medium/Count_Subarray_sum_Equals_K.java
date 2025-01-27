package new_array_medium;

import java.util.HashMap;

public class Count_Subarray_sum_Equals_K {
    public static void main(String[] args) {
        int [] nums={2,3,5};
        int k=5;
        System.out.println(count_subarray_sum(nums,k));
        System.out.println(count_subarry(nums, k));
    }
    public static int count_subarray_sum(int nums[], int k){
//       this ans allow for positive number
        int l=0, r=0;
        int sum=nums[r];
        int count =0;
        while(r<nums.length){
            sum +=nums[r];
            if(sum < k){
                r++;

            }else if(sum == k){
                count++;
                r++;
            }
            else if(sum >k) {
                while(sum >k){
                    sum-= nums[l];
                    l++;
                    if(sum == k){
                        count++;
                    }
                }
                r++;
            }

        }
        return count;
    }
    public static int count_subarry(int nums[], int k){
//        optimal approach
        HashMap<Integer, Integer> map =new HashMap<>();
        int count =0, prefixsum=0;
        map.put(0, 1);
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i];
            int remove =prefixsum -k;
            if(map.containsKey(remove)){
                count += map.get(remove);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);
        }
        return count;

    }
}
