
using System;

public class Solution
{
    public string CompressedString(string word)
    {
        var compressed = new StringBuilder(2 * word.Length);
        int frequency = 1;

        for (int i = 1; i < word.Length; ++i)
        {
            if (frequency == 9 || word[i - 1] != word[i])
            {
                compressed.Append((char)(frequency + '0'));
                compressed.Append(word[i - 1]);
                frequency = 1;
                continue;
            }
            ++frequency;
        }
        compressed.Append((char)(frequency + '0'));
        compressed.Append(word[word.Length - 1]);

        return compressed.ToString();
    }
}
