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
    int prev = 0;
    boolean visitedNode = false;
    public boolean isValidBST(TreeNode root) {
        boolean[] res = new boolean[1];
        dfs(root, res);
        return !res[0];
    }

    private void dfs(TreeNode root, boolean[] res){
        if(root == null) return;

        dfs(root.left, res);
        if(root.val <= prev && visitedNode){
            res[0] = true;
        }
        visitedNode = true;
        prev = root.val;
        dfs(root.right, res);
    }
}
