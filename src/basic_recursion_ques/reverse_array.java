package basic_recursion_ques;

public class reverse_array {
    public static void main(String[] args) {
        int nums []={1,2,3,4,5};
        int n=5;
//        System.out.println(reverse(n, nums));
        reverse(n, nums);
        reverse_recursive(nums, 0, n-1);
        printArray(n, nums);
    }
    public static void reverse(int n,int [] nums){
//        int [] ans=new int[n];
        int l=0;
        int r=nums.length-1;
        while (l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
//         ans[l]=temp;
            l++;
            r--;
        }
        printArray(n, nums);
    }
    public static void printArray(int n, int[] nums){
        System.out.print("reverse array->");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }
    }
//    recursive way
    public static void reverse_recursive(int nums[], int start, int end){
        while(start<end){
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            reverse_recursive(nums, start+1, end-1);
        }
    }
    public static void printArray(int nums[], int n){
        System.out.print("reverse array ");
        for(int i=0;i<=n;i++){
            System.out.println(nums[i]+ " ");
        }
    }
}
