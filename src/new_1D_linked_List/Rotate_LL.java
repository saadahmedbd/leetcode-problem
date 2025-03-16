package new_1D_linked_List;

class List{
    List next;
    int val;
    List(){}
    List(int val){
        this.val=val;
    }
}
public class Rotate_LL {
    public static void main(String[] args) {

    }
    public List rotateLL(List head, int k){
        if(head == null) return  null;

        List curr=head;
        int size=0;
        while(curr.next != null){
            curr=curr.next;
            size++;
        }
        size+=1;

        k=k%size;

        curr.next=head;
        curr=head;
        int i=1;
        int loopStop=size-k;
        while (i < loopStop){
            curr=curr.next;
            i++;
        }
        List newHead=curr.next;
        curr.next=null;
        return newHead;
    }
}
