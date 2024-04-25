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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }

        Queue<Pair<TreeNode, Boolean>> q = new LinkedList<>();
        q.offer(new Pair<>(root, false));
        int left = 0;

        while(!q.isEmpty()){
            Pair<TreeNode, Boolean> p = q.poll();
            TreeNode node = p.getKey();
            boolean isLeft = p.getValue();

            if(isLeft && node.left == null && node.right == null){
                left = left + node.val;
            }

            if(node.left != null){
                q.offer(new Pair<>(node.left, true));
            }

            if(node.right != null){
                q.offer(new Pair<>(node.right, false));
            }
        }

        return left;

    }
}