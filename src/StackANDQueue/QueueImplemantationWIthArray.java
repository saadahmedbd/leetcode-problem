package StackANDQueue;
class QueueImp{

    private int []QArr;
    private int currSize=0;
    private int capacity;
    private int start=-1;
    private int end=-1;
    public QueueImp(int size){
        this.capacity=size;
        this.QArr=new int[size];
    }
    //push operation
    void push(int n){
        if(currSize ==capacity){
            System.out.println("queue overfollow");
            return;
        }if(currSize ==0){
            start=0;
            end=0;
        }else{
            end=(end+1) % capacity;

        }
        QArr[end]=n;
        currSize+=1;
    }
    int el;
    int pop(){

        if(currSize==0){
            System.out.println("stack is overfollow");
            return -1;
        }
        el =QArr[start];
        if(currSize ==1){
            start=-1;
            end=-1;
        }else{
            start=(start+1) %capacity;
        }
        currSize -=1;
        return el;
    }
    int size(){
        return currSize;
    }
    int top(){
        if(currSize ==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return QArr[start];
    }
}
public class QueueImplemantationWIthArray {
    public static void main(String[] args) {
        QueueImp obj =new QueueImp(10);
        obj.push(12);
        obj.push(13);
        System.out.println(obj.size());
        obj.pop();
        System.out.println(obj.size());
        System.out.println(obj.top());
    }
}
