package main

import "fmt"

func main() {
	slice := make([]int, 3, 3)
	slice2 := append(slice, 4, 5)

	fmt.Println(slice)
	fmt.Println(slice2)

	slice[1] = 100

	fmt.Println(slice)
	fmt.Println(slice2)
}
