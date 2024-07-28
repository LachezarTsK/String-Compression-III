
package main

import "fmt"

func compressedString(word string) string {
    compressed := make([]byte, 2*len(word))
    frequency := 1
    index := 0

    for i := 1; i < len(word); i++ {
        if frequency == 9 || word[i-1] != word[i] {
            compressed[index] = byte(frequency) + '0'
            index++
            compressed[index] = word[i-1]
            index++
            frequency = 1
            continue
        }
        frequency++
    }
    compressed[index] = byte(frequency) + '0'
    index++
    compressed[index] = word[len(word)-1]
    index++

    return string(compressed[:index])
}
