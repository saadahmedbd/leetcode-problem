package sorting_algorithms;

public class bubble_sort {
    public static void main(String[] args) {
        int [] nums={13,46,24,52,20,9};
        int n = nums.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        bubble(nums, n);
    }
    public static void bubble(int nums[], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j] >nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
