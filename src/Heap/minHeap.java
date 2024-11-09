package Heap;

import java.util.PriorityQueue;

public class minHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        minHeap.add(7);
        minHeap.add(10);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(20);
        minHeap.add(15);

        while (!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }


    }
}
