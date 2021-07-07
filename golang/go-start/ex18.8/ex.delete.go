package main

import "fmt"

func main() {
	delete1()
	delete2()
	delete3()
}

func delete1() {
	slice := []int{1, 2, 3, 4, 5, 6}
	idx := 2

	for i := idx + 1; i < len(slice); i++ {
		slice[i-1] = slice[i]
	}

	slice = slice[:len(slice)-1]
	fmt.Println("slice : ", slice)
}
func delete2() {
	slice := []int{1, 2, 3, 4, 5, 6}
	idx := 2

	slice = append(slice[:idx], slice[idx+1:]...)

	fmt.Println("slice : ", slice)
}
func delete3() {

	slice := []int{1, 2, 3, 4, 5, 6}
	idx := 2

	copy(slice[idx:], slice[:idx+1])

	slice = slice[:len(slice)-1]
	fmt.Println("slice : ", slice)
}
