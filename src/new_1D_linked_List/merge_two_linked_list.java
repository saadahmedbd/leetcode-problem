package new_1D_linked_List;
class Linked{
    int val;
    Linked next;
    Linked(int val){
        this.val=val;
        this.next=next;
    }

}

public class merge_two_linked_list {
    public static void main(String[] args) {


    }
    public static Linked merged(Linked list1, Linked list2){
        if(list1 == null && list2 == null) return null;
        Linked dummyNode =new Linked(-1);
        Linked p1=list1;
        Linked p2 =list2;
        Linked curr =dummyNode;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                p1.next=curr;
                curr=curr.next;
                p1=p1.next;
            }else{
                p2.next=curr;
                curr=curr.next;
                p2=p2.next;
            }
        }
        if(p1 == null) curr.next=p2;
        if(p2 == null) curr.next=p1;
        return dummyNode.next;


    }
}
