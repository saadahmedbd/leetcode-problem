package new_binary_search_1D_array;

public class peak_indexes {
    public static void main(String[] args) {
        int nums []={5, 4, 3, 2, 1};
        System.out.println(peakElement(nums));
        System.out.println(PeakElement(nums));
    }
    public static int peakElement(int nums[]){
        int start =0;
        int end =nums.length-1;
        int ans =Integer.MIN_VALUE;
        while (start <= end){
            int mid =(start+end)/2;
            if(nums[start] <= nums[mid]){
                ans =Math.max(nums[mid], ans);
                start =mid+1;
            }else{
                ans=Math.max(nums[end], ans);
                end =mid-1;
            }
        }
        return ans;
    }
//    main solution
    public static int PeakElement (int nums[]){
        int start =0;
        int end =nums.length-1;
        while (start< end){
            int mid =(start + end)/2;
            if(nums[mid] < nums[mid+1]){
                start =mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}
