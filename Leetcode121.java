class Solution {
    public int maxProfit(int[] prices) {
        int output = 0;
        int start = Integer.MAX_VALUE;
        int cumulativeProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < start){
                start = prices[i];
            }
            cumulativeProfit = prices[i] - start;
            if(output < cumulativeProfit){
                output = cumulativeProfit;
            }
        }
        return output;
    }
}