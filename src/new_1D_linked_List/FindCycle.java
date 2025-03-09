package new_1D_linked_List;

class  Node{
    int val;
    Node next;
    Node(){}
    Node (int val, Node next){
        this.val=val;
        this.next=next;
    }
}
public class FindCycle {
    public static void main(String[] args) {
        Node obj=new Node();
        obj.val=12;
        obj.val=13;


    }
    public boolean findCycle(Node head){
//        if(head == null || head.next == null){
//            return ;
//        }
        Node fast=head;
        Node slow=head;
        while (fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
}
