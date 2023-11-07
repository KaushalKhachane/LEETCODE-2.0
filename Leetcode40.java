class Solution {
    void solve(int[] can, int k, List<List<Integer>> ans, int s, int sum, List<Integer> list, Set<List<Integer>> uq) {
        if (sum > k)
            return;
        if (sum == k) {
            if (uq.add(new ArrayList<>(list))) {

                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = s; i < can.length; i++) {
            if (i > s && can[i] == can[i - 1]) {
                continue; // Skip duplicates to avoid duplicate combinations
            }

            list.add(can[i]);
            solve(can, k, ans, i + 1, sum + can[i], list, uq);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(can);
        Set<List<Integer>> uq = new HashSet<>();
        solve(can, target, ans, 0, 0, list, uq);
        return ans;
    }
}