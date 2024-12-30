package variable_size_subarray;

public class longest_sum {
    public static void main(String[] args) {
        int nums[]={4,1,1,1,2,3};
        int k=5;
        System.out.println(find_longest_sum(nums,k));
        System.out.println(longestSUm(nums,k));
    }
    public static int find_longest_sum(int nums[], int k){
        int l=0;
        int sum=0;
        int ans=200;
        for(int r=0;r<nums.length;r++){
            sum += nums[r];
            if(sum == k){
                ans =Math.min(r-l+1,ans);
            }else if( sum > k){
                sum -=nums[l];
                l++;
            }
        }
        return ans;
    }
    public static int longestSUm(int [] nums, int k){
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
            }
            r++;
        }
        return ans;

    }
}
