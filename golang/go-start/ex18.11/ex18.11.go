package main

import (
	"fmt"
)

func main() {
	add()
	add2()
	add3()
}
func add() {
	slice := []int{1, 2, 3, 4, 5, 6}
	slice = append(slice, 0)
	idx := 2
	for i := len(slice) - 2; i >= idx; i-- {
		slice[i+1] = slice[i]
	}
	slice[idx] = 100
	fmt.Println(slice)
}
func add2() {
	slice := []int{1, 2, 3, 4, 5, 6}
	idx := 2

	slice = append(slice[:idx], append([]int{100}, slice[:idx]...)...)

	fmt.Println(slice)
}
func add3() {
	slice := []int{1, 2, 3, 4, 5, 6}
	idx := 2

	slice = append(slice, 0)
	copy(slice[idx+1:], slice[idx:])

	fmt.Println(slice)
}
