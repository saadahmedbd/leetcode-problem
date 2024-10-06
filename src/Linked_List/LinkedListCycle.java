package Linked_List;



import java.util.LinkedList;

public class LinkedListCycle{
    Node head;

        class Node {
            Node next;
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
                System.out.println(currnode.data+" ->");
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
            while (lastNode != null){
                lastNode =lastNode.next;
                secondLastNode=secondLastNode.next;
            }
            secondLastNode.next=null;
        }

        //cycle leetcode question
    public boolean cycle(){
            Node slow =head;
            Node fast =head;
            while(fast != null&& fast.next != null){
                fast =fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
    }
    // find middle of the linkedList
    public Node middleNode(){
            Node fast =head;
            Node slow =head;
            while (fast != null && fast.next != null){
                fast =fast.next.next;
                slow=slow.next;

            }
            return slow;
    }
    //delete node in a linked list
    public void deletNode(Node node){
            node.data =node.next.data;
            node.next=node.next.next;
    }
    //reverse linked list
    public Node reverseList(Node head){
            if(head ==null || head.next==null){
                return head;
            }
            Node prevNode =null;
            Node currNode =head;
            while(currNode !=null){
                Node nextNode =currNode.next;
                currNode.next=prevNode;
                // update
                prevNode=currNode;
                currNode=nextNode;
            }
            return prevNode;//prevNode point to the head
    }
    //remove nth node from end of list
    //techniq =1

    public Node removeNthNode(Node head, int n){
            if(head.next ==null){
                return null;
            }
            //count size
            int size =0;
            Node curr =head;
            if(curr != null){
                curr =curr.next;
                size++;
            }
            if(size ==n) return head.next;

            int i =1;
            int indexToReach = size-n;
            Node prev =head;
            while(i<indexToReach){
                prev =prev.next;
            }
            prev.next=prev.next.next; //delete n node
            return head;
    }
    //remove duplicate from sorted list

    public Node deleteDuplicate(Node head){
        //base case
        if(head==null || head.next ==null) return head;

        Node curr=head;
        Node temp =curr.next;

        while(temp != null){
            if(curr.data ==temp.data){
                temp=temp.next;
                continue;
            }
            curr.next=temp;
            curr=temp;
            temp=temp.next;
        }
        curr.next=null;
        return head;

    }
    //reverse linked list
    public Node reverseLinkedList(Node head){

            if(head ==null || head.next==null){
                return head;
            }

            Node prev =null;
            Node curr =head;
            while (curr != null){
                Node temp =curr.next;
                curr.next=prev; //curr point to prev
                prev=curr;
                curr=temp;
            }
            return prev;
    }

    //merge two sorted array
    public Node mergeTwoSortedList(Node list1, Node list2){
            Node dummyNode=new Node(-1);
            Node p1=list1, p2=list2, curr =dummyNode;
            while (p1 != null && p2 != null){
                if(p1.data <p2.data){
                    curr.next=p1;
                    curr=curr.next;
                    p1=p1.next;
                }else{
                    curr.next=p2;
                    curr.next=curr;
                    p2=p2.next;
                }
            }
            if(p1 ==null) curr.next=p2;
            if(p2==null) curr.next=p1;
            return dummyNode.next;
    }




    public static void main(String[] args) {
        LinkedListCycle list =new LinkedListCycle();
            list.addfirst(3);
            list.addfirst(8);
            list.addfirst(9);
        System.out.println(list.cycle());
        System.out.println(list.middleNode());
        System.out.println(list.reverseList(list.head));
        System.out.println(list.removeNthNode(list.head, 1));
        System.out.println(list.deleteDuplicate(list.head));



    }


    }
