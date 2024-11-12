package Heap;

import java.util.PriorityQueue;

public class kth_largest_element_in_an_array {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k =4;
        System.out.println(kth_largest_element(nums, k));
    }
    public static int kth_largest_element(int [] nums, int k){
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
