package Binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inOrderTraversal {
    public static void main(String[] args) {

    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val=val;
            this.left= left;
            this.right=right;
        }
    }
    public static  class solition{
        List<Integer> list =new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root){
            if(root==null) return list;

            Stack<TreeNode> stack=new Stack<>();
            TreeNode curr =root;
            while(!stack.isEmpty() || curr !=null){
                while (curr !=null){
                    stack.push(curr);
                    curr=curr.left;
                }
                curr=stack.pop();
                list.add(curr.val);
                curr=curr.right;
            }

            return list;

        }


    }
}
