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
    int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        int[] res = new int[1];
        dfs(root, k, res);
        return res[0];
    }

    private void dfs(TreeNode root, int k, int[] res){
        if(root == null) return;
        dfs(root.left, k, res);
        count++;
        if(count == k){
            res[0] = root.val;
        }
        dfs(root.right, k, res);
    }
}
