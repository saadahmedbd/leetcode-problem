package new_1D_linked_List;

class Listnode{
    int val;
    Listnode next;
    Listnode(){}
    Listnode(int val){
        this.val=val;
    }
}
public class sort_LL {
    public static void main(String[] args) {

    }
//    approach merge sort
    public static Listnode sortLL(Listnode head){
        if(head == null || head.next == null) return head;
        Listnode middle =findMiddle(head);
        Listnode right=middle.next;
        middle.next=null;
        Listnode left=head;

        //recursive sort
        left=sortLL(left);
        right=sortLL(right);

        return mergeTwoListNode(left,right);

    }
    public static Listnode findMiddle(Listnode head){
        Listnode fast=head.next; //if fast can't start head.next then we will face staackoverfollow error

        Listnode slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
//    sort two linkedList
    public static Listnode mergeTwoListNode(Listnode head1, Listnode head2){
        //create dummyNode for sort the listNode
        Listnode dummyNode =new Listnode(-1);
        //create pointer for checking node val
        Listnode p1=head1;
        Listnode p2=head2;
        Listnode curr=dummyNode;
        while(curr != null){
            if( p1.val <= p2.val){
                curr.next=p1;
                curr=curr.next;
                p1=p1.next;
            }else{
                curr.next=p2;
                curr=curr.next;
                p2=p2.next;
            }
        }
        if(p1 == null) curr.next=p2;
        if(p2 == null) curr.next=p1;
        return dummyNode.next;
    }
}
