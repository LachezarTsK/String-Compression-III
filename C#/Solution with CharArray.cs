
using System;

public class Solution
{
    public string CompressedString(string word)
    {
        var compressed = new char[2 * word.Length];
        int frequency = 1;
        int index = 0;

        for (int i = 1; i < word.Length; ++i)
        {
            if (frequency == 9 || word[i - 1] != word[i])
            {
                compressed[index++] = (char)(frequency + '0');
                compressed[index++] = word[i - 1];
                frequency = 1;
                continue;
            }
            ++frequency;
        }
        compressed[index++] = (char)(frequency + '0');
        compressed[index++] = word[word.Length - 1];

        return String.Join("", compressed.Take(index));
    }
}
