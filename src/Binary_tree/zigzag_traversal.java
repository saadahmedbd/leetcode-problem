package Binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzag_traversal {
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
        public static List<List<Integer>> zigZag(TreeNode root){
            List<List<Integer>> ans =new ArrayList<>();
            if(root==null) return ans;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            int level =0;
            while(!queue.isEmpty()){
                int size = queue.size();
                List<Integer> list=new ArrayList<>();
                while (size != 0){
                    TreeNode curr =queue.poll();

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
    }
}
