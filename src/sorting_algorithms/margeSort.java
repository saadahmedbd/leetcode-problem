package sorting_algorithms;

public class margeSort {
    public static void main(String[] args) {

    }
    public static int[] marge_Sort(int [] nums){
        int left =0, right =nums.length-1;
        margesort(nums, left, right);
        return nums;
    }
    public static void margesort(int []nums, int left, int right){
        if(left<right){
            int mid =left+(right-left)/2;
            margesort(nums, left, mid);
            margesort(nums, mid+1, right);
            marge(nums, left, mid, right);
        }

    }
    public static void marge(int[] nums, int left, int mid, int right){
        int n1 =mid-left+1; // length of A array
        int n2 =right-mid ; // length of B array
        int[] A =new int[n1];
        int [] B =new int [n2];

        for(int i=0;i<n1;i++){// traverse on the A array
            A[i] =nums[left+1];
        }
        for(int i=0;i<n2;i++){
            B[i] =nums[mid+1+i];
        }

        int i=0, j=0 ,k=left;
        while (i<n1 && j<n2){
            if(A[i] <=B[j]){
                nums[k++] =A[i++];
            }else{
                nums[k++] =B[j++];
            }
        }
        while (i<n1) nums[k++] =nums[i++];
        while(j<n2) nums[k++] =nums[j++];
    }
}
