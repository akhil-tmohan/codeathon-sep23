import org.junit.Test
import org.junit.Assert.*

class SortStringByFrequencyTest {
    @Test
    fun testSortStringByFrequency() {
        assertEquals("eeefffggghhiinooorrrssttt", sortStringByFrequency("this is a test string"))
        assertEquals("aaabbbccc", sortStringByFrequency("abcabcabc"))
        assertEquals("a", sortStringByFrequency("a"))
        assertEquals("", sortStringByFrequency(""))
    }
}