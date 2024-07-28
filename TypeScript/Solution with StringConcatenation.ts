
function compressedString(word: string): string {
    let compressed = "";
    let frequency = 1;

    for (let i = 1; i < word.length; ++i) {
        if (frequency === 9 || word.charAt(i - 1) !== word.charAt(i)) {
            compressed += frequency + word.charAt(i - 1);
            frequency = 1;
            continue;
        }
        ++frequency;
    }
    compressed += frequency + word.charAt(word.length - 1);

    return compressed;
};
