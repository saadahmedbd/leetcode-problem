package new_1D_linked_List;
class link{
    int val;
    link next;
    link(){}
    link(int val){
        this.val=val;
    }
}
public class remove_duplicate {
    public static void main(String[] args) {

    }
    public static link removeDuplicate(link head){
        if(head == null && head.next== null) return head;
        link prev=head;
        link curr =head.next;
        while (curr != null){
            if(prev.val==curr.val){
                prev.next=prev.next.next;
            }
            prev=prev.next;
            curr=curr.next;
        }
        return head;
    }


}
