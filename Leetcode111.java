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
    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // If the current node is a leaf, return 1
        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftDepth = Integer.MAX_VALUE;
        int rightDepth = Integer.MAX_VALUE;

        // Calculate the minimum depth for the left subtree
        if (root.left != null) {
            leftDepth = minDepth(root.left);
        }

        // Calculate the minimum depth for the right subtree
        if (root.right != null) {
            rightDepth = minDepth(root.right);
        }

        // The minimum depth is the minimum of left and right subtree depths + 1
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
