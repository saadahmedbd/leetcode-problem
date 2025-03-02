package new_binary_search_on_ans;

import java.util.Arrays;

public class aggresive_cows {
    public static void main(String[] args) {
        int nums [] ={0,3,4,7,10,9};
        int cows=4;
        System.out.println(aggresiveCows(cows, nums));
    }
    public static int aggresiveCows(int cows, int nums[]){
//       apply binary search
        Arrays.sort(nums);
        int low =0;
        int high=nums[nums.length-1] -nums[0];
        while (low <= high){
            int mid =(low+high)/2;
            if(position_of_cows(nums, cows, mid) == true){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;

    }
//    positionOfCows function
    public static boolean position_of_cows(int nums[], int cows, int dist){
        int placed=1;
        int last =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last >= dist){
                placed++;
                last=nums[i];
            }
            if(placed >= cows) return true;
        }
        return false;
    }
}
