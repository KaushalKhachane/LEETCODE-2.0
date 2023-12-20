class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int currentSum = prices[i] + prices[j];
                if (currentSum <= money) {
                    minSum = Math.min(minSum, currentSum);
                }
            }
        }

        return (minSum == Integer.MAX_VALUE) ? money : money - minSum;
    }
}