class Solution {
    public int maxProfit(int[] prices) {
        //  int maxProfit = 0;
        // int n = prices.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) { 
        //         int profit = prices[j] - prices[i];
        //         if (profit > maxProfit) {
        //             maxProfit = profit;
        //         }
        //     }
        // }

        // return maxProfit;
        int minSoFar = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
                         
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }
}