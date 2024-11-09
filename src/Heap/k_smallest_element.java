package Heap;

import java.util.PriorityQueue;

public class k_smallest_element {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k =4;
        System.out.println(kSmallestNumber(nums,k));


    }
    public static int kSmallestNumber(int[] nums, int k){
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>();
        for(int i=0;i<nums.length-1;i++){
            maxHeap.add(nums[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
