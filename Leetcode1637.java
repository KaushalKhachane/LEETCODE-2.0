class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> target = new ArrayList<>();
        int ans = 0;

        for(int i = 0; i < points.length; i++){
            target.add(points[i][0]);
        }

        Collections.sort(target);

        for(int i = 1; i < target.size(); i++){
            int width = target.get(i) - target.get(i-1);
            ans = Math.max(ans, width);
        }

        return ans;
    }
}
