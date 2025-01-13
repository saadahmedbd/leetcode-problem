package sorting_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

//Time complexity: O(nlogn)
//space complexity ; 0(n)

public class new_merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//       Solution.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int [] arr, int low, int mid, int high){
        ArrayList<Integer> temp =new ArrayList<>();
        int left =low;
        int right =mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
//        if elements on the left half are still left
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
//        //  if elements on the right half are still left //
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
//        transferring all array to temp array
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void merge (int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int mid =(high- low)/2;
        merge(arr, low, mid);
        merge(arr, mid+1, high);
        mergeSort(arr, low, mid, high);
    }
}
