package Daily_leetcode_challenge;

public class Longest_nice_subArray {
    public static void main(String[] args) {
        int nums[] ={744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664};
        System.out.println(longestNiceSubArray(nums));
        System.out.println(longestNiceSubarray(nums));
    }
    public static int longestNiceSubArray(int nums []){
        int ans=1;
        int curr_sum=0; //find the curr sum
        int xor_sum=0; //find the x or sum
        int r=0;
        int l=0;
        while(r<nums.length){
            curr_sum += nums[r]; //
            xor_sum ^= nums[r];
            while(curr_sum != xor_sum){
                curr_sum -=nums[l];
                xor_sum ^= nums[l];
                l++;
            }
            ans=Math.max(ans, r-l+1);
            r++;
        }
        return ans;

    }
        public static int longestNiceSubarray(int[] nums) {
            int n = nums.length;
            int maxLength = 1;
            int left = 0;
            int usedBits = 0;

            for (int right = 0; right < n; right++) {
                while ((usedBits & nums[right]) != 0) {
                    usedBits ^= nums[left];
                    left++;
                }

                usedBits |= nums[right];
                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
    }

