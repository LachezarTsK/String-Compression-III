
class Solution {

    fun compressedString(word: String): String {
        val compressed = StringBuilder(2 * word.length)
        var frequency = 1

        for (i in 1..<word.length) {
            if (frequency == 9 || word[i - 1] != word[i]) {
                compressed.append(frequency)
                compressed.append(word[i - 1])
                frequency = 1
                continue
            }
            ++frequency
        }
        compressed.append(frequency)
        compressed.append(word[word.length - 1])

        return compressed.toString()
    }
}
