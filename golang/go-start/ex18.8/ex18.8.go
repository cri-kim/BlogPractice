package main

import (
	"fmt"
)

func copySlice1() {
	slice1 := []int{1, 2, 3, 4, 5}
	slice2 := make([]int, len(slice1))

	for i, v := range slice1 {
		slice2[i] = v
	}
	slice2[1] = 100
	fmt.Println("slice1", slice1)
	fmt.Println("slice2", slice2)

}
func copySlice2() {
	slice1 := []int{1, 2, 3, 4, 5}
	slice2 := append([]int{}, slice1...)

	slice2[1] = 100
	fmt.Println("slice1", slice1)
	fmt.Println("slice2", slice2)
}
func copySlice3() {
	slice1 := []int{1, 2, 3, 4, 5}
	slice2 := make([]int, len(slice1))
	copy(slice2, slice1)
	//copy(목적지, 출발지)

	slice2[1] = 100
	fmt.Println("slice1", slice1)
	fmt.Println("slice2", slice2)
}
func main() {
	copySlice1()
	copySlice2()
	copySlice3()
}
