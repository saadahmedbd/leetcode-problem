package Binary_tree;

import com.sun.source.tree.BinaryTree;

public class buildTree {
    public static void main(String[] args) {
        int nodes [] ={1,2,4,-1,-1,5,-1,-1,5,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        TreeNode root =tree.BuildingTree(nodes);
        System.out.println(root.data);

    }
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class binaryTree{
        public static int idx =-1;
        public static TreeNode BuildingTree(int[] nodes){
            idx++;
            if(nodes[idx] ==-1){
                return null;
            }
            TreeNode newNode =new TreeNode(nodes[idx]);
            newNode.left=BuildingTree(nodes);
            newNode.right=BuildingTree(nodes);
            return newNode;
        }
    }



}

