
class Solution {

    private companion object {
        const val ASCII_ZERO = 48
    }

    fun compressedString(word: String): String {
        val compressed = CharArray(2 * word.length)
        var frequency = 1
        var index = 0

        for (i in 1..<word.length) {
            if (frequency == 9 || word[i - 1] != word[i]) {
                compressed[index++] = (frequency + ASCII_ZERO).toChar()
                compressed[index++] = word[i - 1]
                frequency = 1
                continue;
            }
            ++frequency;
        }
        compressed[index++] = (frequency + ASCII_ZERO).toChar()
        compressed[index++] = word[word.length - 1]

        return compressed.slice(0..<index).joinToString("")
    }
}
