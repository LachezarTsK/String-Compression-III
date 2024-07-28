
import java.util.Arrays;

public class Solution {

    public String compressedString(String word) {
        char[] compressed = new char[2 * word.length()];
        int frequency = 1;
        int index = 0;

        for (int i = 1; i < word.length(); ++i) {
            if (frequency == 9 || word.charAt(i - 1) != word.charAt(i)) {
                compressed[index++] = (char) (frequency + '0');
                compressed[index++] = word.charAt(i - 1);
                frequency = 1;
                continue;
            }
            ++frequency;
        }
        compressed[index++] = (char) (frequency + '0');
        compressed[index++] = word.charAt(word.length() - 1);

        return String.valueOf(Arrays.copyOfRange(compressed, 0, index));
    }
}
