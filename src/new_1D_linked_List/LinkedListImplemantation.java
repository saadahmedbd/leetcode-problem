package new_1D_linked_List;
class LinkedList{
    Node head;
    int size;
    LinkedList(){
        size=0;
    }
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
//    add firstNode
    public void addFirstNode(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
//        newNode point to head
        newNode.next=head;
//        head point to newNode
        head=newNode;
    }
//    addLastNode
    public void addLastNode(int data){
        Node newNode =new Node(data);
        Node currNode =head;
        while (currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        if(head == null){
            head=newNode;
            return;
        }
    }
    public void printNode(){
        if(head == null){
            System.out.println("empty linked List");
        }
        Node currNode =head;
        while (currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
//    deleteFirstNode
    public void deleteFirstNode(){
        if(head == null){
            return;
        }
        head=head.next;
    }
//    deleteLast
    public void deleteLastNode(){
        if(head == null){
            head=null;
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondNode=head; //secondNode should stop at the second-last node.
        Node lastNode=head.next; //lastNode should reach the last node.
        while (lastNode.next != null){ // Stop at second-last node
            secondNode=lastNode;
            lastNode=lastNode.next;

        }
        secondNode.next=null; // Remove last node
    }
}

public class LinkedListImplemantation {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.addFirstNode(3);
        obj.addFirstNode(4);
        obj.addLastNode(5);
        obj.addLastNode(7);
        obj.printNode();
        obj.deleteLastNode();
        obj.deleteLastNode();
        obj.printNode();
    }
}
