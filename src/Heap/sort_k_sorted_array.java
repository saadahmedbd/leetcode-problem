package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class sort_k_sorted_array {
    public static void main(String[] args) {
        int [] nums={6,5,3,2,8,10,9};
        int k=3;
        System.out.println(k_sorted_array(nums,k));
    }
    public static List<Integer> k_sorted_array(int[] nums, int k){
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                int ans =minHeap.poll();
                list.add(ans);
            }
        }
        while (!minHeap.isEmpty()){
            int ans=minHeap.poll();
            list.add(ans);
        }
        return list;
    }
}
