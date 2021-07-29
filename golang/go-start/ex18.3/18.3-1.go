package main

import (
	"fmt"
)

func main() {
	array := [5]int{1, 2, 3, 4, 5}

	slice := array[1:2]
	fmt.Println("array : ", array)
	fmt.Println("slice : ", slice, len(slice), cap(slice))

	//슬라이싱은 새로운 배열을 만드는 것이 아닌 기존배열을 활용하는 것임을 인지해야한다.
	array[1] = 100
	fmt.Println("After change second element")
	fmt.Println("array : ", array)
	fmt.Println("slice : ", slice, len(slice), cap(slice))

	slice = append(slice, 500)
	fmt.Println("After append 500")
	fmt.Println("array : ", array)
	fmt.Println("slice : ", slice, len(slice), cap(slice))
}
