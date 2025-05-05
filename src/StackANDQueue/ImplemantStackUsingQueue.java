package StackANDQueue;

import java.util.LinkedList;
import java.util.Queue;

class ImpQueue{
    Queue<Integer> queue =new LinkedList<>();
    void push(int x){
        queue.add(x);
        for(int i=1;i<queue.size();i++){ // queue follow FIFO and stack follow LIFO
            // when we add value in queue it will add
            // first and if we want top or pop value it will give us
            //queue format value but we need stack format value
            //that why we revese the queue element and last element come
            // in first and we got stack format value
            // ex :[1,2,3] //queue : top ->1 pop -> 1
            // after reverse -> [2,1], add 3, [3,2,1] top 3, pop 3
            //that is stack format value
            queue.add(queue.remove());
        }
    }
    int pop(){
        return queue.poll();
    }
    int peek(){
        return queue.peek();
    }
    boolean empty(){
        if(queue.isEmpty()){
            return false;
        }
        return true;
    }
}
public class ImplemantStackUsingQueue {
    public static void main(String[] args) {
        ImpQueue ob =new ImpQueue();
        ob.push(3);
        ob.push(2);
        ob.push(4);
        ob.push(5);

        System.out.println(ob.pop());
        ob.push(6);


        System.out.println(ob.peek());

        System.out.println(ob.empty());

    }
}
