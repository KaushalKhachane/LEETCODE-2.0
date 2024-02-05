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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the root is null, return false
        if (root == null) {
            return false;
        }
        
        // If the current node is a leaf and its value equals the targetSum, return true
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        
        // Recursive calls for the left and right subtrees with updated targetSum
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }
}