package new_array_medium;

import java.util.HashMap;

public class maximum_sum_of_distinct_number {
    public static void main(String[] args) {
        int [] nums={2,4,6,3,9,9,9};
        int k=3;
        System.out.println(maximum_sum(nums, k));
    }
    public static int maximum_sum(int[] nums, int k){
        HashMap<Integer, Integer> map =new HashMap<>();
        int left =0;
        int ans =0;
        for(int right =0;right<nums.length;right ++){
            int sum =0;
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            if(right -left +1 == k){
                if(map.size() == k){
                    ans =Math.max(ans, sum);
                }
                sum -=nums[left];
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

        }
        return ans;
    }
}
