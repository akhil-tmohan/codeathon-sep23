fun isValidIPAddress(ip: String): Boolean {
    val parts = ip.split(".") // split the IP address into its parts
    if (parts.size != 4) return false // if there are not exactly 4 parts, it is not a valid IP address
    for (part in parts) {
        try {
            val num = part.toInt() // try to convert the part to an integer
            if (num < 0 || num > 255) return false // if the number is not between 0 and 255, it is not a valid IP address
            if (num.toString() != part) return false // if the number has leading zeros, it is not a valid IP address
        } catch (e: NumberFormatException) {
            return false // if the part cannot be converted to an integer, it is not a valid IP address
        }
    }
    return true // if all parts are valid, it is a valid IP address
}