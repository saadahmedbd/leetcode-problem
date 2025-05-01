package StackANDQueue;

import java.util.Stack;

class ImpStack{
    Stack<Integer> stack =new Stack<>();
    Stack <Integer> stack2=new Stack<>();

    void push(int x){
        // tniking : we create two stack , stack one add the value when we add the second
        // then we copy stack1 first value and insert stack. again stack2 first value
        //will add in stack1.
        //s1 [1] add 1
        // ex s1:[2]  add 2
        //s2[2,1]
        //s1 [2,1]
       while (stack.isEmpty()==false){
           stack2.push(stack.pop());

       }
        stack.push(x);
       while (stack2.isEmpty()==false){
           stack.push(stack2.pop());
       }
    }
    int pop(){
        return stack.pop();
    }
    int top(){
        return stack.peek();
    }
    boolean empty(){
        return stack.isEmpty();
    }
}
public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        ImpStack obj =new ImpStack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println();
    }
}
