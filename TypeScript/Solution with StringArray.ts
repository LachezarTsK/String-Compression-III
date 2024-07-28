
function compressedString(word: string): string {
    const compressed: string[] = new Array(2 * word.length);
    let frequency = 1;
    let index = 0;

    for (let i = 1; i < word.length; ++i) {
        if (frequency === 9 || word.charAt(i - 1) !== word.charAt(i)) {
            compressed[index++] = `${frequency}`;
            compressed[index++] = word.charAt(i - 1);
            frequency = 1;
            continue;
        }
        ++frequency;
    }
    compressed[index++] = `${frequency}`;
    compressed[index++] = word.charAt(word.length - 1);

    return compressed.slice(0, index).join('');
};
