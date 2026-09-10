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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();

        if(root != null){
            nodes.offer(root);
        }

        while(!nodes.isEmpty()){
            int size = nodes.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = nodes.poll();
                if(i == size - 1){
                    res.add(temp.val);
                } 

                if(temp.left != null){
                    nodes.offer(temp.left);
                }
                if(temp.right != null){
                    nodes.offer(temp.right);
                }
            }
        }

        return res;
    }
}
