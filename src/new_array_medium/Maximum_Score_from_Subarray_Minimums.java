package new_array_medium;

public class Maximum_Score_from_Subarray_Minimums {
    public static void main(String[] args) {
        int arr[]={4,3,1,5,6};
        System.out.println(maximum_Score_from_Subarray_Minimums(arr));
    }
    public static int maximum_Score_from_Subarray_Minimums(int [] arr){
        int maxsum=0;
        int sum=0;
        int l=0;
        int r;
        for(r=1;r<arr.length;r++){
            sum =arr[l]+arr[r];
            maxsum=Math.max(sum, maxsum);
            sum=0;
            l++;
        }
        return maxsum;
    }
}
