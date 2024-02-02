import java.util.*;

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

    static class Pair {
        TreeNode root;
        int hd;
        Pair(TreeNode root, int hd) {
            this.root = root;
            this.hd = hd;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // add your code here
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, List<Pair>> mp = new TreeMap<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode curr = p.root;
            int hd = p.hd;

            if (mp.containsKey(hd)) {
                mp.get(hd).add(p);
            } else {
                List<Pair> list = new ArrayList<>();
                list.add(p);
                mp.put(hd, list);
            }

            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }

        // declare the list for storing the result now
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, List<Pair>> entry : mp.entrySet()) {
            List<Pair> list = entry.getValue();
            Collections.sort(list, new Comparator<Pair>() {
                @Override
                public int compare(Pair a, Pair b) {
                    return a.root.val - b.root.val;
                }
            });

            List<Integer> levelValues = new ArrayList<>();
            for (Pair pair : list) {
                levelValues.add(pair.root.val);
            }
            res.add(levelValues);
        }
        return res;
    }
}
