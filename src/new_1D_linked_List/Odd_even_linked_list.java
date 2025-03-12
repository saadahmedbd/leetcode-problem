package new_1D_linked_List;
class LisTNode {
  int val;
   LisTNode next;
   LisTNode() {}
   LisTNode(int val) { this.val = val; }
    LisTNode(int val, LisTNode next) { this.val = val; this.next = next; }
  }
public class Odd_even_linked_list {
    public static void main(String[] args) {
        LisTNode obj= new LisTNode();
        obj.val=12;
        obj.val=13;
        obj.val=14;
        obj.val=15;
        obj.val=16;
        System.out.println();

    }
    public LisTNode oddEvenList (LisTNode head){
        if(head == null || head.next == null){
            LisTNode odd= head;
            LisTNode even =head.next;
            while(even != null && even.next != null){
                odd.next=odd.next.next;
                even.next=even.next.next;
                odd=odd.next;
                even=even.next;
            }
        }
        return head;

    }
}
