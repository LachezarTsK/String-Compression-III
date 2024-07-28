
package main

import (
    "fmt"
    "strings"
)

func compressedString(word string) string {
    compressed := strings.Builder{}
    frequency := 1

    for i := 1; i < len(word); i++ {
        if frequency == 9 || word[i-1] != word[i] {
            compressed.WriteByte(byte(frequency)+'0')
            compressed.WriteByte(word[i-1])
            frequency = 1
            continue
        }
        frequency++
    }
    compressed.WriteByte(byte(frequency)+'0')
    compressed.WriteByte(word[len(word)-1])

    return compressed.String()
}
