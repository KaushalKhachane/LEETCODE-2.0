class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        int n = piles.length/3;
        int i = piles.length - 2;

        while(n != 0){
            ans += piles[i];
            i -= 2;
            n--;
        }

        return ans;
    }
}