package new_1D_linked_List;

import java.util.HashMap;

class LinkedLi{
    int val;
    LinkedLi next;
    LinkedLi(){}
    LinkedLi(int val){
        this.val=val;
    }
}
public class Intersection_Node {
    public static void main(String[] args) {

    }
    public static LinkedLi intersection(LinkedLi head1, LinkedLi head2){
        HashMap<LinkedLi, Integer> map =new HashMap<>();
        LinkedLi temp=head1;
        while (temp != null){
            map.put(temp, map.getOrDefault(temp,0)+1);
            temp=temp.next;
        }
        LinkedLi temp2=head2;
        while (temp2 != null){
            if(map.containsKey(temp2)){

                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
    public  static LinkedLi intersec(LinkedLi headA, LinkedLi headB){
        LinkedLi dummy1=headA;
        LinkedLi dummy2=headB;
        while (dummy1 != dummy2){
            // dummy1=dummy1 == null ? headB : dummy1.next;
            if(dummy1 == null){
                dummy1=headB;
            }else{
                dummy1=dummy1.next;
                // dummy2=dummy2 ==null ? headA : dummy2.next;
            }if(dummy2== null){
                dummy2=headA;
            }else{
                dummy2=dummy2.next;
            }
        }
        return headA;
    }
}
