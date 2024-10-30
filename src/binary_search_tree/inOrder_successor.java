package binary_search_tree;

import Binary_tree.lowest_common_anceestor;

public class inOrder_successor {
    public static void main(String[] args) {

    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public class solution{
        public static TreeNode inOrderSuccessor(TreeNode root, TreeNode x){
            TreeNode successor =null;
            TreeNode curr =root;
            while(curr != null){
                if(x.val < curr.val){
                    successor=curr;
                    curr=curr.left;
                }else{
                    curr=curr.right;
                }
            }
            return successor;

        }
    }
}
