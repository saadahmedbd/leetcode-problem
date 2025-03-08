package Linked_List;

public class linked_list_implementation {
    Node head;

    class Node {
        Node next ;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //addfirst
    public void addfirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next =head;
        head=newNode;
    }
    //add last
    public void addlast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currnode=head;
        while (currnode.next != null){
            currnode=currnode.next;
        }
        currnode.next=newNode;
    }
    //print node
    public void printNode(){
        if(head==null){
            System.out.println("node is empty");
        }
        Node currnode =head;
        while (currnode != null){
            System.out.print(currnode.data+" ->");
            currnode =currnode.next;
        }
        System.out.println("null");
    }
    //delete first node
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    //delete last node
    public void deleteLast(){
        //base case
        if(head ==null){
            head=null;
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLastNode =head;
        Node lastNode =head.next;
        while (lastNode.next != null){
            secondLastNode=lastNode;
            lastNode=lastNode.next;
        }
        secondLastNode.next=null;
    }
    public static void main(String[] args) {
        linked_list_implementation list =new linked_list_implementation();
        list.addfirst(3);
        list.addlast(9);
        list.addlast(10);
        list.printNode();
        list.deleteLast();
        list.printNode();
    }

}
