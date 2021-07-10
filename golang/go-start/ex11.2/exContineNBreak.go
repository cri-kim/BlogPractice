package main

import (
	"fmt"
)

func main() {
	for i := 0; i < 10; i++ {
		if i == 3 {
			continue
		}
		if i == 6 {
			break
		}
		fmt.Println("6 * ", i, "=", 6*i)
	}
}

//output
//0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
//10
