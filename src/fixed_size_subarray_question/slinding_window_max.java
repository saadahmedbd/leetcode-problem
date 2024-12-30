package fixed_size_subarray_question;

public class slinding_window_max {
    public static void main(String[] args) {
        int [] nums={1,3,-1,-3,5,3,6,7};
        int k=4;
        System.out.println(findMaxInteger(nums,k));
    }
    public static int[] findMaxInteger(int []  nums, int k) {
//        approch
//        1)create base case that is if our length id 0 and k is 0 then our ans will be 0
//        2) create size of ans that is => number of array - k +1; 8-3+1 =6;
//        3) our initial start poistion will start in 0 index and finish index windowSize
//        4/ end position start -k +1 ;0-3+1=2 index
//        5) iniial max value will be nums[start] 
//        6) find out max value that why we use loop that will go start position to end position
//        max value will be update
//        and result will store on result[l] = maxvalue
        //base case
        int n=nums.length;
        if(n==0 || k==0){
            return new int [0];
        }
        //make ressult array
        int numsOfWindow =n-k+1;
        int [] result=new int[numsOfWindow];
        for(int start=0;start<numsOfWindow;++start){
            int end=start+k-1;
            int maxValue =nums[start];
            for(int i=start+1;i<=end;i++){
                if(maxValue < nums[i]){
                    maxValue= nums[i];
                }
            }
            result[start]=maxValue;
        }
        return result;
    }
}
