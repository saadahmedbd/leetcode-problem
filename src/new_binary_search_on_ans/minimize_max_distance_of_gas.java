package new_binary_search_on_ans;

public class minimize_max_distance_of_gas {
    public static void main(String[] args) {
        int nums [] ={1,10,14,19,22};
        int k=5;
        System.out.println(minimizeMaxDistance(nums, k));
    }
//    optimal approach binary search
    public static double minimizeMaxDistance(int nums[], int k){
        double diff=1e-6;
        double low=0;
        double high=maxValue(nums);

        while (high-low > diff){
            double mid=(low+high)/2.0;
            double cnt =numberOfGasStationRequried(nums, mid);
            if(cnt > k){
                low =mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public static double numberOfGasStationRequried(int nums[], double dist){
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            int numberInBetween = (int) ((nums[i]-nums[i-1])/dist);
            if(nums[i] -nums[i-1] == (dist * numberInBetween)){
                numberInBetween--;
            }
            cnt +=numberInBetween;
        }
        return cnt;
    }
    public static double maxValue(int nums []){
        double max=0;
        for(int i=0;i<nums.length-1;i++){
            max =Math.max(max, (nums[i+1]-nums[i]));
        }
        return max;
    }
}
