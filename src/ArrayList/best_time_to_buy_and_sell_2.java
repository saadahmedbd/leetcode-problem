package ArrayList;
//leetcode 122 asked by google

public class best_time_to_buy_and_sell_2 {
    public static void main(String[] args) {
        int[] nums={7, 6, 4, 3, 1};
        System.out.println(buy_sell_2(nums));
    }
    public static int buy_sell_2(int nums[]){
        int result =0;
        int l=0;
        int r=1;
        while(r<nums.length){
            if(nums[l]<nums[r]){
                int ans=nums[r]-nums[l];
                result =result+ans;
                l=r;

            }else{
                l=r;

            }
            r++;
        }
        return result;
    }
}
