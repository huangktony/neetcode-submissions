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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int rootIndex = 0;

        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == preorder[0]){
                rootIndex = i;
            }
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] rightInorder = Arrays.copyOfRange(inorder, rootIndex+1, inorder.length);

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + leftInorder.length), leftInorder);
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + leftInorder.length, preorder.length), rightInorder);

        return root;
    }
}
