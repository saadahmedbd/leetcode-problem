package StackANDQueue;

class StImp{
    private int top=-1;
    private int st [];
    private int capacity;
    //create constructor
    StImp(int size){
        this.capacity=size; //allow cate memory
        this.st=new int[size];
    }
    //push function
    void push(int n){
        if(top >=capacity-1){
            System.out.println("stack overfollow");
            return;

        }
        st[++top]=n;
    }
    int pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return st[top--];
    }
    int  top(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return st[top];
    }
    int size(){
        return top+1;
    }
    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

}
public class ImplemantStackWIthArray {
    public static void main(String[] args) {
        StImp obj =new StImp(10);
        obj.push(10);
        obj.push(12);
        System.out.println(obj.size());
        obj.pop();
        System.out.println(obj.size());

    }

}
