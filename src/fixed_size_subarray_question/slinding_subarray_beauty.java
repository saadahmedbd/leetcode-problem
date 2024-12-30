package fixed_size_subarray_question;

public class slinding_subarray_beauty {
    public static void main(String[] args) {
        int [] nums={1,-1,-3,-2,3};
        int x=2, k=3;
        System.out.println(subarrayBeauty(nums,x,k));
    }
    public static int[] subarrayBeauty(int[] nums, int x, int k){
        int[] counter = new int[50],
                ans = new int[nums.length - k + 1];;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) counter[nums[i] + 50]++;
            if (i - k >= 0 && nums[i - k] < 0) counter[nums[i - k] + 50]--;
            if (i - k + 1 < 0) continue;
            for (int j = 0, count = 0; j < 50; j++) {
                count += counter[j];
                if (count >= x) {
                    ans[i - k + 1] = j - 50;
                    break;
                }
            }
        }
        return ans;
    }
}
