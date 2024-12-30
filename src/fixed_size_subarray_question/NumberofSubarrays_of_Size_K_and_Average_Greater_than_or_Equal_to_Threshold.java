package fixed_size_subarray_question;

public class NumberofSubarrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold {
    public static void main(String[] args) {
        int []arr={5,6,7,1,2,3};
        int k=2;
        int threshold=3;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int count=0;
        double sum=0;
        int r=0;
        while(r<arr.length){
            if(r-l+1 <k){
                sum += arr[r];
                r++;
            }else if(r-l+1 == k){
                sum += arr[r];
                double average=sum/k;
                if(average >= threshold){
                    count ++;
                }
                sum -= arr[l];
                l++;
                r++;
            }
        }
        return count;
    }
}
