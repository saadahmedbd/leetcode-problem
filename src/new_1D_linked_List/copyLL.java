package new_1D_linked_List;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



public class copyLL {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        if(head == null) return head;

        copyNode(head);
        copyRandomNode(head);
        return deepCopy(head);


    }
    // insert copy node between two node
    public void copyNode(Node head){
        // temp point to head for iterate the loop
        Node temp=head;
        while( temp != null){
            // store temp nextNode to another variable
            Node nextElement =temp.next;
            //create copy node and store temp data
            Node copy =new Node(temp.val);
            // temp Node connect to copy node
            temp.next=copy;
            // copy node connect  to temp next element(NextElement)
            copy.next=nextElement;
            // temp update to nextElement
            temp=nextElement;
        }
    }
    // copy node connect to random node
    public void copyRandomNode(Node head){
        Node temp =head;
        while(temp != null){
            // access the copied node
            Node copy = temp.next;
            // now point to random node
            if(temp.random != null){
                copy.random =temp.random.next;
            }else{
                copy.random =null;
            }
            // mode to the next original node
            temp=temp.next.next;

        }
    }
    public Node deepCopy(Node head){
        Node dummyNode =new Node(-1);
        Node temp=head;
        Node res=dummyNode;
        while(temp != null){
            // res is new node that is dummy
            // res point to temp.next and temp next is our copynode
            res.next=temp.next;
            res=res.next;

            //disconnect the copy node and update temp
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
}
