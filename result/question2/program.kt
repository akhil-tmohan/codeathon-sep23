fun findMaxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE // initialize the minimum price to the maximum possible value
    var maxProfit = 0 // initialize the maximum profit to 0
    for (price in prices) {
        if (price < minPrice) { // if the current price is less than the minimum price so far
            minPrice = price // update the minimum price
        } else if (price - minPrice > maxProfit) { // if the current price minus the minimum price is greater than the maximum profit so far
            maxProfit = price - minPrice // update the maximum profit
        }
    }
    return if (maxProfit == 0) -1 else maxProfit // if no profit can be made, return -1, otherwise return the maximum profit
}