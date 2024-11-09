package Heap;

import java.util.PriorityQueue;

public class maxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a,b)->b-a);
        maxHeap.add(7);
        maxHeap.add(10);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(20);
        maxHeap.add(15);

    while (!maxHeap.isEmpty()){
        System.out.println(maxHeap.poll());
    }

    }
}
