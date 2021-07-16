package main

import (
	"fmt"
)

func main() {
	str1 := "Hello World"
	var slice []byte = []byte(str1)

	slice[2] = 'a'
	fmt.Println(str1)
	fmt.Printf("%s\n", slice)
}
