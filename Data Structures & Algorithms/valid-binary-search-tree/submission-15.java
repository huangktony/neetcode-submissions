/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        boolean[] invalid = new boolean[1];
        dfs(root, invalid);
        return !invalid[0];
    }

    private void dfs(TreeNode root, boolean[] invalid){
        if(root == null) return;

        dfs(root.left, invalid);
        if(prev != null && prev.val >= root.val){
            invalid[0] = true;
        }
        prev = root;
        dfs(root.right, invalid);
    }
}
