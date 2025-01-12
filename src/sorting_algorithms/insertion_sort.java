package sorting_algorithms;

public class insertion_sort {
    public static void main(String[] args) {
    int nums[] ={13, 46, 24, 52, 20, 9};
    int n=nums.length;
        System.out.println("before insertion sort :");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }
        insertion(nums, n);
        System.out.println();
    }
    public static void insertion (int [] nums, int n){
        for(int i=0;i<n; i++){
            int j=i;
            while(j > 0 && nums[j -1] >nums[j]){
                int temp =nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j--;
            }
        }
        System.out.println("after insertion sort: ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
