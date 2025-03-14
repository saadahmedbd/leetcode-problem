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
}
