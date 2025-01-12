package sorting_algorithms;

public class selection_sort {
    public static void main(String[] args) {
        int nums[]= {13, 46, 24, 52, 20, 9};
        int n=nums.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        selection(nums, n);
    }
    public static void selection(int [] nums, int n){
//        int n=nums.length;
       for(int i=0;i<n-1;i++){
           int mini=i;
           for(int j=i+1;j<n;j++){
               if(nums[j]<nums[mini]){
                   mini=j;
               }
           }
           int temp=nums[i];
           nums[i]=nums[mini];
           nums[mini]=temp;
       }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }


}
