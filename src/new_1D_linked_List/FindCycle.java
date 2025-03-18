package new_1D_linked_List;

class LLNode {
    int val;
    LLNode next;
    LLNode(){}
    LLNode(int val, LLNode next){
        this.val=val;
        this.next=next;
    }
}
public class FindCycle {
    public static void main(String[] args) {
        LLNode obj=new LLNode();
        obj.val=12;
        obj.val=13;


    }
    public boolean findCycle(LLNode head){
//        if(head == null || head.next == null){
//            return ;
//        }
        LLNode fast=head;
        LLNode slow=head;
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
