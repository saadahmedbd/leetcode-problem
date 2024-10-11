package Binary_tree;

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
}
