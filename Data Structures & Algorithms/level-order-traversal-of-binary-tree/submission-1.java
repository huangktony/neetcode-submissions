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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        if(root == null) return list;
        
        nodes.offer(root);

        while(!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> curDepth = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode curNode = nodes.poll();
                if(curNode.left != null){
                    nodes.offer(curNode.left);
                }
                if(curNode.right != null){
                    nodes.offer(curNode.right);
                }
                curDepth.add(curNode.val);
            }


            list.add(curDepth);
        }
        
        return list;
    }
}
