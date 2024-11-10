package Heap;

import java.util.*;

public class find_k_closet_element {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int arr[]={1,2,3,4,5};
        int k=4;
        int x=3;
        System.out.println(k_closet_element(nums,k,x));
        System.out.println(KClosetElemet(arr,k,x));

    }
    public static List<Integer> k_closet_element(int [] nums, int k, int x){

    PriorityQueue<int[]> maxHeap =new PriorityQueue<>((int[] a,int [] b)->(a[0]==b[0]) ? (a[1]-b[1]) : (a[0]-b[0]));
    for (int arr :nums){
        maxHeap.add(new int[] {Math.abs(x-arr), arr});
        if(maxHeap.size()>k){
            maxHeap.poll();
        }
    }
    List<Integer> list=new ArrayList<>();
    while (!maxHeap.isEmpty()){
        list.add(maxHeap.poll()[1]);
    }
    Collections.sort(list);
    return list;

    }
    public static List<Integer> KClosetElemet(int[] arr, int k, int x){
        // Create a max heap to store numbers based on their distance from x

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            // Compare based on the distance (a[0])
            if (a[0] == b[0]) {
                // If distances are equal, compare the actual numbers (a[1])
                return Integer.compare(b[1], a[1]);
            } else {
                // Otherwise, compare based on distance
                return Integer.compare(b[0], a[0]);
            }
        });
        // Iterate through each number in the array
        for (int num : arr) {
            // Add the number as an array [distance, number] to the max heap
            maxHeap.add(new int[] {Math.abs(x - num), num});

            // Ensure the size of the heap does not exceed k
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the farthest number from x
            }
        }
        // Extract the numbers from the heap and store them in a list
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll()[1]); // Add the number part (index 1)
        }

        // Sort the list in ascending order before returning
        Collections.sort(result);
        return result;

    }
}
