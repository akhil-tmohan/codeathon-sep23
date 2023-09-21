class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Run question 1
            val arr = intArrayOf(5, 3, 8, 4, 2)
            println("Question 1: ${findSecondLargest(arr)}")

            // Run question 2
            val ip = "192.168.0.1"
            println("Question 2: ${isValidIPAddress(ip)}")

            // Run question 3
            val prices = intArrayOf(7, 1, 5, 3, 6, 4)
            println("Question 3: ${findMaxProfit(prices)}")

            // Run question 4
            val arr2 = intArrayOf(5, 3, 8, 4, 2)
            println("Question 4: ${sortArray(arr2).contentToString()}")
        }
    }
}