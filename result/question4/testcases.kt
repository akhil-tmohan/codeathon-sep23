import org.junit.Test
import org.junit.Assert.*

class SortArrayTest {
    @Test
    fun testSortArray() {
        // Test case 1: Empty array
        assertArrayEquals(intArrayOf(), sortArray(intArrayOf()))
        
        // Test case 2: Array with one element
        assertArrayEquals(intArrayOf(1), sortArray(intArrayOf(1)))
        
        // Test case 3: Array with multiple elements
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), sortArray(intArrayOf(5, 4, 3, 2, 1)))
        
        // Test case 4: Array with negative elements
        assertArrayEquals(intArrayOf(-5, -4, -3, -2, -1), sortArray(intArrayOf(-1, -2, -3, -4, -5)))
        
        // Test case 5: Array with repeated elements
        assertArrayEquals(intArrayOf(1, 1, 2, 2, 3, 3), sortArray(intArrayOf(3, 2, 1, 2, 1, 3)))
    }
}