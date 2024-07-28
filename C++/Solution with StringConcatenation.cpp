
#include <string>
using namespace std;

class Solution {

public:
    string compressedString(const string& word) const {
        string compressed;
        compressed.reserve(2 * word.size());
        int frequency = 1;

        for (int i = 1; i < word.size(); ++i) {
            if (frequency == 9 || word[i - 1] != word[i]) {
                compressed.push_back(frequency + '0');
                compressed.push_back(word[i - 1]);
                frequency = 1;
                continue;
            }
            ++frequency;
        }
        compressed.push_back(frequency + '0');
        compressed.push_back(word[word.size() - 1]);

        return compressed;
    }
};
