package Heap;

import java.util.HashMap;

import java.util.PriorityQueue;

public class top_k_frequent_element {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        int k=2;
        System.out.println(topKFrequentElement(nums,k));
    }
    public static int[] topKFrequentElement(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> minHeap =new PriorityQueue<>((a, b)->map.get(b)-map.get(a));
        int [] res=new int[k];
        for(int key:map.keySet()){
            minHeap.add(key);
        }
        for(int i=0;i<k;i++){
            res[i]=minHeap.poll();
        }
        return res;

    }
}
