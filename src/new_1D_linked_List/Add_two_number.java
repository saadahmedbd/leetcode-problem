package new_1D_linked_List;
class listNode{
    listNode next;
    int val;
    listNode(){}
    listNode(int val){
        this.val=val;
    }
}
public class Add_two_number {
    public static void main(String[] args) {

    }
    public  listNode addNumber(listNode l1, listNode l2){
        //make dummy node for create new linkedlist
        listNode dummy=new listNode(-1);
        // curr for iteartion
        listNode curr=dummy;
        int carry=0;
        int sum=0;
        while (l1 != null || l2 != null || carry != 0 ){
            //carry will be sum
            sum=carry;

            // sum of l1 value
            if(l1 != null){
                sum += l1.val;
                l1=l1.next;
            }if(l2 != null){
                sum += l2.val;
                l2=l2.next;
            }
            //if sum is two digit then num take one digit and carry take another digit
            int num =sum %10; // means if sum =20 , 20%10 =0;
            carry=sum /10; //carry take 20/10 =2;
            curr.next=new listNode(num);
            curr=curr.next;
        }
        return dummy.next;
    }
}
