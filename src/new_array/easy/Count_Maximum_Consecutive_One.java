package new_array.easy;

public class Count_Maximum_Consecutive_One {
    public static void main(String[] args) {
        int nums[] ={0};
        System.out.println(count_maximum_consecutive(nums));
    }
    public static int count_maximum_consecutive(int [] nums){
        int count=0;
        int ans=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r] == nums[l] && nums[r] == 1){
                count+=1;
            }else{
                count=0;
            }
            ans=Math.max(count, ans);
            l++;
        }
        return ans;
    }
}
