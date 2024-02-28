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
    int result = 0;
    int maxDepth = -1;

    public void findBottomLeftValueHelper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (depth > maxDepth) {
            maxDepth = depth;
            result = root.val;
        }

        findBottomLeftValueHelper(root.left, depth + 1);
        findBottomLeftValueHelper(root.right, depth + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValueHelper(root, 0);
        return result;
    }
}
