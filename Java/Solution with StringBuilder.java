
public class Solution {

    public String compressedString(String word) {
        StringBuilder compressed = new StringBuilder(2 * word.length());
        int frequency = 1;

        for (int i = 1; i < word.length(); ++i) {
            if (frequency == 9 || word.charAt(i - 1) != word.charAt(i)) {
                compressed.append(frequency).append(word.charAt(i - 1));
                frequency = 1;
                continue;
            }
            ++frequency;
        }
        compressed.append(frequency).append(word.charAt(word.length() - 1));
        return compressed.toString();
    }
}
