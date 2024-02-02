class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Check if both nodes are null, they are the same
        if (p == null && q == null) {
            return true;
        }
        
        // Check if one of the nodes is null (but not both), they are not the same
        if (p == null || q == null) {
            return false;
        }

        // Check if the values of the current nodes are equal
        if (p.val == q.val) {
            // Recursively check the left and right subtrees
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        // If values are not equal, the trees are not the same
        return false;
    }
}
