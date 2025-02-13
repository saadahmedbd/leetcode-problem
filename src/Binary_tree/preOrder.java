package Binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class preOrder {
    public static void main(String[] args) {
    }
    public static void PreOrder(buildTree.TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static List<Integer> preOrderStack(buildTree.TreeNode root){
        List<Integer> list =new ArrayList<>();
        if(root ==null) return list;
        Stack<buildTree.TreeNode> stack=new Stack<>();
        stack.push(root);
        buildTree.TreeNode curr =root;
        while(!stack.isEmpty()){
            curr =stack.pop();
            while(stack.isEmpty()){
                list.add(curr.data);
                if(curr.right != null) stack.push(curr.right);
                curr =curr.left;

            }
        }
        return list;
    }

}
