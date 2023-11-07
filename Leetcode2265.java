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

    public int[] dfs(TreeNode root, int[] res){
        if(root == null){
            return new int[]{0,0} ;// sum count 0 0
        }

        int[] left = dfs(root.left,res);
        int[] right = dfs(root.right, res);

        int totalsum = root.val + left[0] + right[0];
        int totalCount = 1 + left[1] + right[1];

        if(totalsum / totalCount == root.val){
            res[0]++;
        }

        return new int[]{totalsum, totalCount};
    }

    public int averageOfSubtree(TreeNode root) {
        int[] result = {0}; // Store the count of nodes

        dfs(root, result);

        return result[0];
    }
}