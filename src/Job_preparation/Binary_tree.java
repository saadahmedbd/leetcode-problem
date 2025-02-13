package Job_preparation;

import java.util.*;

public class Binary_tree {
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
//    bfs
//    level order
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans =new ArrayList<>();
        if(root ==null) return ans;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size =queue.size();
            List<Integer> list=new ArrayList<>();
            while (size != 0){
                TreeNode currNode =queue.poll();
                list.add(currNode.val);
                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right != null) queue.add(currNode.right);
                size--;
            }
            ans.add(list);
        }
        return ans;
    }
//    zigzag traversal
    public static List<List<Integer>> zigZag(TreeNode root){
        List<List<Integer>> ans =new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level =0;
        while (queue.isEmpty()){
            int size =queue.size();
            List<Integer> list =new ArrayList<>();
            while (size!= 0){
                TreeNode curr=queue.poll();
                if(level %2 ==0) list.add(curr.val);
                else if(level %2 ==1) list.add(0, curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
                size--;

            }
            level++;
            ans.add(list);
        }
        return ans;
    }
//    DFS (depth fetch search)
//    preorder traversal
    public static List<Integer> preOrder(TreeNode root){
        List<Integer> ans =new ArrayList<>();
        if(root == null) return ans;
        Stack <TreeNode> stack =new Stack<>();
        stack.push(root);
        TreeNode curr =root;
        while (!stack.isEmpty()){
            curr =stack.pop();
            while (stack.isEmpty()){
                ans.add(curr.val);
                if(curr.right != null) stack.push(curr.right);
                curr=curr.left;
            }
        }
        return ans;
    }
//    postOrder travsersal
    public static List<Integer> postOrder (TreeNode root){
        List<Integer> ans =new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode curr =stack.pop();
            while (stack.isEmpty()){
                ans.add(curr.val);
                if(curr.left != null) stack.add(curr.left);
                curr =curr.right;
            }
        }
        Collections.reverse(ans);
        return ans;

    }
//    inOrder traversal
    public static List<Integer> inOrder(TreeNode root){
        List<Integer> ans =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        TreeNode curr =root;
        while (!stack.isEmpty() && curr != null){
            while (curr != null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}
