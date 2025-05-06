package StackANDQueue;
class StackImp{
    private int top=-1;
    private int[] st;
    private int capacity;
    public  StackImp(int size){
        this.capacity=size;
        this.st=new int[size];
    }
    //top method
    public void push(int n){
        if(top >=capacity-1){
            System.out.println("stack overfollow");
            return;
        }
        st[++top]=n;
    }
    public int pop(){
        if(top ==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return st[top--];
    }
    public int top(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return st[top];
    }
    int size(){
        return top+1;
    }
    boolean isempty(){
        if(top ==-1){
            return false;
        }
        return true;
    }
}
public class ImplemanStack {
    public static void main(String[] args) {
        StackImp stack =new StackImp(10);
        stack.push(12);
        stack.push(13);
        stack.push(34);
        stack.push(56);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
    }
}
