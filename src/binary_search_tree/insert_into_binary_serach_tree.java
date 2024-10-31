package binary_search_tree;

public class insert_into_binary_serach_tree {
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
        public static TreeNode insertIntoBST(TreeNode root, int val){
            TreeNode curr =root;
            while(curr!= null){
                if(curr.val < val){
                    if(curr.right != null) curr=curr.right;
                    else{
                        curr.right =new TreeNode(val);
                        break;
                    }
                }else {
                    if(curr.left != null) curr=curr.left;
                    else{
                        curr.left=new TreeNode(val);
                        break;
                    }
                }
            }
            return root;
            //0(logn) 0(1)
        }

        public static TreeNode insertIntoBst(TreeNode root, int val){
            if(root ==null) return new TreeNode(val);
            return dfs(root, val);
        }
        public static TreeNode dfs(TreeNode root, int val){
            if(root == null) return null;

            if(root.val >val){
                root.left=dfs(root.left, val);
            }else if(root.val <val){
                root.right=dfs(root.right, val);
            }

            return root;

            //0(n) 0(n)
        }
    }
}
