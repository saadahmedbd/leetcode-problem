package new_1D_linked_List;
class linked{
    int val;
    linked next;
    linked(){

    }
    linked (int val){
        this.val=val;
    }
}

public class Delete_nth_node_from_last_to_first {
    public static void main(String[] args) {

    }
    public static linked deleteNthNode(int n, linked head){
        if(head ==null) return null;
        int size =1;
        linked curr=head;
        while (curr != null){
            curr=curr.next;
            size++;
        }
        int i=0;
        int indextoSearch=size-n;
        linked prev=head;
        while (i < indextoSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
