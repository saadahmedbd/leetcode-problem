package new_array.easy;

public class Longest_Subarray_with_given_Sum_K {
    public static void main(String[] args) {
//        int nums[] = {2,3,5,1,9};
        int nums[] = {4,1,1,-2,1,5};


        int n = nums.length, k = 5;
        System.out.println(longest_sum(nums, n, k));
        System.out.println(longest_subarray_of_k_sum(nums, n, k));
    }

    public static int longest_sum(int nums[], int n, int k) {
        int l = 0;
        int r = 0;
        int ans = nums[0];
        int sum = 0;
        while(r<n){
            while(l<=r && sum >k){
                sum -= nums[l];
                l++;
            }
            if(sum == k){
                ans=Math.max(ans, r-l+1);
            }
            r++;
            if(r<n){
                sum += nums[r];

            }
        }

        return ans;
    }
    public static int longest_subarray_of_k_sum(int nums[], int n, int k){
        int l=0,r=0;
        int sum=0, ans=0;
        while(r<nums.length){
            sum += nums[r];
            if(sum <k){
                r++;
            }else if(sum == k){
                ans=Math.max(r-l+1,ans);
                r++;
            }else if(sum > k){
                while(sum > k){
                    sum -=nums[l];
                    l++;
                    if(sum == k){
                        ans=Math.max(r-l+1, ans);
                    }
                }
                r++;
            }

        }
        return ans;
    }
}

