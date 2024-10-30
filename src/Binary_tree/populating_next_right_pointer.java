package Binary_tree;

public class populating_next_right_pointer {
    public static void main(String[] args) {

    }
    class Node{
        int val;
        Node left;
        Node right;
        Node next;
        public Node(int val){
            this.val=val;

        }
    }
    public class solution{
        public Node connect (Node root){
            if(root ==null) return null;
            Node levelStart =root;
            while(levelStart != null){
                Node curr =levelStart;
                Node dummy =new Node(-1);
                Node prev =dummy;
                while(prev != null){
                    if(curr.left != null){
                        prev.next =curr.left;
                        prev =prev.next;
                    }
                    if(curr.right != null){
                        prev.next=curr.right;
                        prev=prev.next;
                    }
                    curr=curr.next;
                }
                levelStart=dummy.next;
                dummy.next=null;

            }
            return root;

        }

    }

}
