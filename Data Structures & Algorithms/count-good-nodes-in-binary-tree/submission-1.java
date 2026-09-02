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
    public int goodNodes(TreeNode root) {
        int[] count = new int[1];
        int greatest = Integer.MIN_VALUE;
        dfs(root, count, greatest);
        return count[0];
    }

    private void dfs(TreeNode root, int[] count, int greatest){
        if(root == null) return;

        if(root.val >= greatest){
            greatest = root.val;
            count[0]++;
        }

        dfs(root.left, count, greatest);
        dfs(root.right, count, greatest);
    }
}
