import org.junit.Test
import org.junit.Assert.*

class FindMaxProfitTest {
    @Test
    fun testFindMaxProfit() {
        // Test case 1: Buy at 1 and sell at 6 for a profit of 5
        assertEquals(5, findMaxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        
        // Test case 2: Cannot make a profit
        assertEquals(0, findMaxProfit(intArrayOf(7, 6, 4, 3, 1)))
        
        // Test case 3: Only one price, cannot make a profit
        assertEquals(0, findMaxProfit(intArrayOf(7)))
        
        // Test case 4: Cannot make a profit
        assertEquals(-1, findMaxProfit(intArrayOf(7, 5, 4, 3, 1)))
        
        // Test case 5: Buy at 2 and sell at 4 for a profit of 2
        assertEquals(2, findMaxProfit(intArrayOf(2, 4, 1)))
    }
}