package new_1D_linked_List;

import java.util.List;

class  ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode (int val, ListNode next){
            this.val=val;
            this.next=next;
        }
}
public class FindMiddle {
    public static void main(String[] args) {

    }
    public ListNode findMiddle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode first=head;
        ListNode slow=head;
        while (first.next != null && first != null){
            first=first.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
