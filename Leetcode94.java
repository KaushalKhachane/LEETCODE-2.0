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

 //PTOD
class Solution {
    void traversal(TreeNode root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        traversal(root.left, res);
        res.add(root.val);
        traversal(root.right, res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();

        traversal(root, res);

        return res;
    }
}