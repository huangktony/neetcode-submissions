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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        dfs(root, post);
        return post;
    }

    private void dfs(TreeNode root, List<Integer> post){
        if(root == null) return;

        dfs(root.left, post);
        dfs(root.right, post);

        post.add(root.val);
    }
}