package new_1D_linked_List;
class LNode {
    int val;
    LNode next;
    LNode(int val, LNode next){
        this.val=val;
        this.next=null;
    }
}
public class FindCycle2 {
    public static void main(String[] args) {

    }
    public LNode findCycle2 (LNode head){
        //first check is array cycle or not; if lisnkelist is cycle then break the
        // list
        LNode fast=head, slow=head;
        while (fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){ // if fast and slow are same position, then loop will break
                break;
            }

        }
        //base case if fast find the null pointer then we will return null bcz this linked
        //list are not cycle

        // now we intilize second variable that called slow2
        //slow2 run start on head position and slow start aagain( where stop the run)
        //if slow and slow2 not same as long as run the loop
        //if slow are same then return slow2
        if(fast == null || fast.next == null) return null;
        LNode slow1=head;
        while (slow1 != null){
            slow1=slow1.next;
            slow=slow.next;
            if(slow1==slow){

            }
        }
        return slow1;
    }
}
