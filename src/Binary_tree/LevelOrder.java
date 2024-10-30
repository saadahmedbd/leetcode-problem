package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
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
    static class solution{
        public static List<List<Integer>> levelOrder(TreeNode root){
            List<List<Integer>> ans =new ArrayList<>();
            if(root==null) return ans;
            Queue<TreeNode> queue =new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()){
                int size =queue.size();
                List<Integer> list=new ArrayList<>();
                while (size != 0){
                    TreeNode curr =queue.poll();
                    list.add(curr.val);
                    if(curr.left != null) queue.add(curr.left);
                    if(curr.right != null) queue.add(curr.right);
                    size--;
                }
                ans.add(list);
            }
            return ans;
        }
    }
}
