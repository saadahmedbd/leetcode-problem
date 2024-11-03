package binary_search_tree;

import javax.swing.tree.TreeCellRenderer;

public class construct_BST_of_Preorder_traversal {
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
        static int NodeIdx=0;
        public static TreeNode constructBST(int[] preOrder){
            if(preOrder.length==0) return null;
            return helper(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        public static TreeNode helper(int[] preOrder, int low, int high){
            if(NodeIdx==preOrder.length || preOrder[NodeIdx] <low || preOrder[NodeIdx] >high) return null;

            int val =preOrder[NodeIdx++];

            TreeNode node =new TreeNode(val);
            node.left=helper(preOrder, low, val);
            node.right=helper(preOrder, val, high);
            return node;
        }
    }
}
