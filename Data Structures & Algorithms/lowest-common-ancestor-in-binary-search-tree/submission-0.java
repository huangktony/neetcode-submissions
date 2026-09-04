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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curNode = root;

        while(curNode != null){
            int pVal = p.val;
            int qVal = q.val;

            if((pVal <= curNode.val && qVal >= curNode.val) || (pVal >= curNode.val && qVal <= curNode.val)){
                return curNode;
            } else if (pVal < curNode.val && qVal < curNode.val){
                curNode = curNode.left;
            } else {
                curNode = curNode.right;
            }
        }

        return curNode;
    }
}
