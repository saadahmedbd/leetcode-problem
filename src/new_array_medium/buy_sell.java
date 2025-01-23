package new_array_medium;

public class buy_sell {
    public static void main(String[] args) {
        int nums[]={1,2,4,2,5,7,2,4,9,0,9};
        System.out.println(max_buy_sell(nums));
    }
    public static int max_buy_sell(int nums[]){
        int l=0;
        int sum=0;
        int maxsum=0;
        for(int r=1;r<nums.length;r++){
            if(nums[l]<nums[r]){
                sum=nums[r]-nums[l];
                maxsum=Math.max(sum, maxsum);

            }else{
                l=r;
            }
        }
        return maxsum;
    }
}
