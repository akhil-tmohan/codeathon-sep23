fun sortStringByFrequency(str: String): String {
    val freqMap = HashMap<Char, Int>()
    for (ch in str) {
        freqMap[ch] = freqMap.getOrDefault(ch, 0) + 1
    }
    val sortedMap = freqMap.entries.sortedByDescending { it.value }.toMap()
    val result = StringBuilder()
    for ((ch, freq) in sortedMap) {
        result.append(ch.toString().repeat(freq))
    }
    return result.toString()
}