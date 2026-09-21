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
        Map<Integer, Integer> inorderMap = new HashMap<>();
        int[] preorderIndex = new int[1];

        for(int i = 0; i < inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }

        return build(inorderMap, preorder, 0, inorder.length - 1, preorderIndex);
    }

    private TreeNode build(Map<Integer, Integer> inorderMap, int[] preorder, int inorderStart, int inorderEnd, int[] preorderIndex){
        if(inorderEnd < inorderStart){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preorderIndex[0]]);
        int rootIndex = inorderMap.get(preorder[preorderIndex[0]]);
        preorderIndex[0]++;
        
        root.left = build(inorderMap, preorder, inorderStart, rootIndex - 1, preorderIndex);
        root.right = build(inorderMap, preorder, rootIndex + 1, inorderEnd, preorderIndex);

        return root;
    }
}
