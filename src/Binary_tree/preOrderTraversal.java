package Binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preOrderTraversal {
    public static void main(String[] args) {

    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left= null;
            this.right=null;
        }

    }
    public static class solution{
        List<Integer> list =new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root){
            if(root==null) return list;

            Stack<TreeNode> stack =new Stack<>();
            stack.push(root);
            TreeNode curr =root;
            while(!stack.isEmpty()){
                curr =stack.pop();

                while(curr != null){
                    list.add(curr.val);
                    if(curr.right != null)
                        curr =stack.push(curr.right);
                    curr =curr.left;

                }
            }
            return list;

        }


    }
}
