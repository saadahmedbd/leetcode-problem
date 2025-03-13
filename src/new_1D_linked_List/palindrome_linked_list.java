package new_1D_linked_List;
class LinkedL{
    int val;
    LinkedL next;
    LinkedL(){

    }
    LinkedL(int val, LinkedL next){
        this.val=val;
    }
}
public class palindrome_linked_list {
    public static void main(String[] args) {

    }
    public static boolean palindrome_number(LinkedL head){
        if(head == null && head.next == null) return false;
        LinkedL firstHalfLast =findMiddle(head);
        LinkedL secondHalf=reverse(firstHalfLast.next);
        LinkedL firstHalf=head;
        while (secondHalf != null){
            if(secondHalf.val != firstHalf.val){
                return false;
            }
            secondHalf=secondHalf.next;
            firstHalf=firstHalf.next;
        }
        return true;

    }
    public static LinkedL findMiddle(LinkedL head){
        if(head == null && head.next == null) return head;
        LinkedL fast =head;
        LinkedL slow=head;
        while (fast != null && fast.next != null){
            fast =fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static  LinkedL reverse(LinkedL head){
        if(head == null && head.next == null){
            return head;
        }
        LinkedL prev =head;
        LinkedL curr=head.next;
        while (curr != null){
            LinkedL next =curr.next;
            //curr conect tp prev
            curr.next=prev;
            //update curr and prev next
            prev =curr;
            curr=next;
        }
        //head point null
//        or return prev
//        return prev;
        head.next=null;
        head=prev;
        return head;
    }
}
