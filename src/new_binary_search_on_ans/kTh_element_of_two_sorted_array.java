package new_binary_search_on_ans;

public class kTh_element_of_two_sorted_array {
    public static void main(String[] args) {
        int a [] ={100, 112, 256, 349, 770};
        int b[] ={72, 86, 113, 119, 265, 445, 892};
        int k=7;
        System.out.print(kTh_element(a, b, k));
    }
    public static int kTh_element(int a[], int b[], int k){
        int arr [] =mergedTwoArray(a, b);
        int low=0;
        int high=arr.length;
        while (low <= high){
            int mid =(low+high)/2;
            if(mid == (k-1)){
                return arr[mid];
            }else if( mid > (k-1)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int[] mergedTwoArray(int[] a, int[] b ){
        int m=a.length;
        int n=b.length;
        int newArray [] =new int[m+n];
        int index=0;
        int l=0;
        int r=0;
        while (l<m && r<n){
            if(a[l] <= b[r]){
                newArray[index]=a[l];
                index++;
                l++;
            }else{
                newArray[index]=b[r];
                index++;
                r++;
            }
        }
        while (l< m){
            newArray[index]=a[l];
            index++;
            l++;
        }
        while (r < n){
            newArray[index]=b[r];
            index++;
            r++;
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i] + " ");
        }
        return newArray;
    }

}
