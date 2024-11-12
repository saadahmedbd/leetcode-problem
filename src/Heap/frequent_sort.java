package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class frequent_sort {
    public static void main(String[] args) {
        int[] nums={1,1,1,3,2,3,2,2,1,4,4,4,4,4,4};
        System.out.println(frequentSort(nums));
    }
    public static List<Integer> frequentSort(int[] nums){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a,b) ->map.get(b)-map.get(a));
        List<Integer> list=new ArrayList<>();

        for(int key : map.keySet()){
            maxHeap.add(key);
        }
        while (!maxHeap.isEmpty()){
            list.add(maxHeap.poll());
        }
        return list;
    }
}
