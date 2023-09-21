import org.junit.Test
import org.junit.Assert.*

class IsValidIPAddressTest {
    @Test
    fun testIsValidIPAddress() {
        // Test case 1: Valid IP address
        assertTrue(isValidIPAddress("192.168.0.1"))
        
        // Test case 2: Invalid IP address (too many parts)
        assertFalse(isValidIPAddress("192.168.0.1.1"))
        
        // Test case 3: Invalid IP address (part out of range)
        assertFalse(isValidIPAddress("192.168.0.256"))
        
        // Test case 4: Invalid IP address (leading zeros)
        assertFalse(isValidIPAddress("192.168.00.1"))
        
        // Test case 5: Invalid IP address (non-numeric part)
        assertFalse(isValidIPAddress("192.168.0.one"))
    }
}