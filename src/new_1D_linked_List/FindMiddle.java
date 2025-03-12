package new_1D_linked_List;

class  ListNode{
        int val;
        LisTNode next;
        ListNode(){}
        ListNode (int val, LisTNode next){
            this.val=val;
            this.next=next;
        }
}
public class FindMiddle {
    public static void main(String[] args) {

    }
    public LisTNode findMiddle(LisTNode head){
        if(head == null || head.next == null){
            return head;
        }
        LisTNode first=head;
        LisTNode slow=head;
        while (first.next != null && first != null){
            first=first.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
