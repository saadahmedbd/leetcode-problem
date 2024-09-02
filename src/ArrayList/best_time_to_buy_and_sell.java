package ArrayList;
//121. Best Time to Buy and Sell Stock asked by facebook and microsoft
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//

public class best_time_to_buy_and_sell {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        System.out.println(buy_sell(nums));
        System.out.println(buy_sell_2(nums));
    }
    public static int buy_sell(int [] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int result=nums[j]-nums[i];
                    ans=Math.max(result, ans);
                    //return ans;
                }


            }
        }
        return ans;

    }
    public static int buy_sell_2(int[] nums){
        int ans=0;
        int l=0;
        int r=l+1;
        while(r<nums.length){
            if(nums[l]<nums[r]){
                int result =nums[r]-nums[l];
                ans=Math.max(result, ans);
               // r++;
            }else{
                l=r; // when left is bigger than right that time execute this line of code
            }

            r++; // always update right
        }

        return ans;
    }
}
