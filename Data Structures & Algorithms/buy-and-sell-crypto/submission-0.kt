class Solution {
    fun maxProfit(prices: IntArray): Int {

        var minBuy = prices[0]
        var profit = 0

        for (i in 1 until prices.size) {
            if (profit < prices[i] - minBuy) {
                profit = prices[i] - minBuy
            }
            
            if (prices[i] < minBuy) {
                minBuy = prices[i]
            }
        }

        return profit

    }
}
