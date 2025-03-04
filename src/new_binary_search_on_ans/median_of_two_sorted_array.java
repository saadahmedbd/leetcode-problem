package new_binary_search_on_ans;

public class median_of_two_sorted_array {
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={3};
//        System.out.println(mergedTwoArray(nums1, nums2));
        System.out.println(medianOfTwoArray(nums1, nums2));
    }
    public static double medianOfTwoArray(int nums1[], int nums2[]){
        int arr[] =mergedTwoArray(nums1, nums2);
        double low=0;
        double high=arr.length;
        int n=arr.length;
        if(n % 2 == 0){
            double ans= arr[n/2-1]+arr[n/2];
            double re=ans/2;
            return re;
        }else{
            double ans=arr[n/2];
            return ans;
        }


    }
    public static int[] mergedTwoArray(int[] nums1, int[] nums2 ){
        int m=nums1.length;
        int n=nums2.length;
        int newArray [] =new int[m+n];
        int index=0;
        int l=0;
        int r=0;
        while (l<m && r<n){
            if(nums1[l] <= nums2[r]){
                newArray[index]=nums1[l];
                index++;
                l++;
            }else{
                newArray[index]=nums2[r];
                index++;
                r++;
            }
        }
        while (l< m){
            newArray[index]=nums1[l];
            index++;
            l++;
        }
        while (r < n){
            newArray[index]=nums2[r];
            index++;
            r++;
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i] + " ");
        }
        return newArray;
    }

}
