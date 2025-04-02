package Daily_leetcode_challenge;

public class Maximum_Value_of_an_Ordered_Triplet_I {
    public static void main(String[] args) {
        int nums [] ={1000000,1,1000000};
        System.out.println(maximumTripletValue(nums));
        System.out.println((1000000-1)*1000000);
    }
    public static long maximumTripletValue(int[] nums) {
        long ans =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long cal=((long) (nums[i]-nums[j])*nums[k]);
                    if(cal > ans){
                        ans =Math.max(cal, ans);
                    }
                }
            }
        }
        return ans;
    }
}
