package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Return_k_lergest_element_in_array {
    public static void main(String[] args) {
        int[] nums={4,5,6,8,1,9};
        int k=4;
        System.out.println(K_leargest_element(nums,k));

    }
    public static List<Integer> K_leargest_element(int[] nums, int k){
        List<Integer> list =new ArrayList<>();
        PriorityQueue<Integer>minheap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minheap.add(nums[i]);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        while (!minheap.isEmpty()){
            int ans=minheap.poll();
            list.add(ans);
        }

        return list;
    }
}
