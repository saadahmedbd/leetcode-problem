package Binary_tree;

import com.sun.source.tree.Tree;

public class lowest_common_anceestor {
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
    public static class solution{
        public TreeNode Lowest_common_ancestor(TreeNode root, TreeNode p, TreeNode q){
            if(root == p || root ==q) return root;
            return dfs(root, p, q);
        }
        public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
            if(root == null) return null;
            if(root == p || root == q) return root;
            if(root.left == null && root.right == null) return null;

            //recusion
            TreeNode leftLCA =dfs(root.left, p, q);
            TreeNode rightLCA =dfs(root.right, p,q);

            if(leftLCA == null && rightLCA != null) return rightLCA;
            if(leftLCA != null && rightLCA == null) return  leftLCA;
            if(leftLCA ==null && rightLCA == null) return  null;
            return root;
        }
    }
}
