package binary_search_tree;

public class convert_sorted_array_to_BST {
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
        public static TreeNode sortedArrayToBST(int[] nums){
            if(nums.length ==0) return null;
            return dfs(nums, 0, nums.length-1);
        }
        public static TreeNode dfs(int[] nums, int low, int high){
            if(low > high) return null;
            int mid =low+(high-low)/2;

            TreeNode root =new TreeNode(nums[mid]);
            root.left=dfs(nums, 0, mid-1);
            root.right=dfs(nums, mid+1, nums.length-1);
            return root;
        }
    }
}
