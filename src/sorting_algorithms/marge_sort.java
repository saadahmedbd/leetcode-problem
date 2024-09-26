package sorting_algorithms;

public class marge_sort {
    public static void main(String[] args) {
        int [] nums ={2, 4, 6, 7, 8};
        System.out.println(sortArray(nums));

    }
    public static int[] sortArray(int[]  nums){
        int left =0, right =nums.length-1;
        margeSort(nums, left, right);
        return nums;
    }
    public static void margeSort(int [] nums, int left, int right){
        if(left<right){
            int mid = left +(right-left)/2;
            margeSort(nums, left ,mid);
            margeSort(nums, mid+1, right);
            marge(nums, left, mid, right);
        }
    }
    public static void marge(int[] nums, int left, int mid, int right){
        int n1 =mid -left +1;
        int n2 =right -mid;
        int [] A =new int[n1];
        int [] B =new int[n2];
        for(int i=0;i<n1;i++){
            A[i] =nums[left+i];
        }
        for(int i=0;i<n2;i++){
            B[i] =nums[mid+1+i];
        }
        //marge two sorted array
        //left -> mid > A mid+1 ->right > B, nums[left -> right]
        // marged two sorted array
        int i =0, j =0, k=left;
        while(i<n1 && j<n2){
            if(A[i]<= B[j]){
                nums[k++] =A[i++];
            }else {
                nums[k++] =B[j++];
            }
        }
        while(i<n1) nums[k++] =A[i++];
        while(j<n2) nums[k++] =B[j++];
    }
}
