package New_recursion_level_1;

public class reverse_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int l=0;
        int r=arr.length-1;
        reverse(arr,l,r);
        int[] nums={6,7,8,9,10};
        int i=0;
        int n=nums.length;
        reverse2(nums,i,n);
    }
    public static void reverse(int[] arr, int l, int r){
        if(l>r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(arr, l+1,r-1);


    }
    public static void reverse2(int [] nums, int i, int n){
        if(i>=n/2){
            return;
        }
        int temp =nums[i];
        nums[i]=nums[n-i-1];
        nums[n-i-1]=temp;
        reverse2(nums,i+1,n);
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]);
        }
    }

}
