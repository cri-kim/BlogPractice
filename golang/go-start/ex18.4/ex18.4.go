package main

import "fmt"

func changeArray(array2 [5]int) {
	array2[2] = 200
}

func changeSlice(slice2 []int) {
	slice2[2] = 200
}

func main() {
	array := [5]int{1, 2, 3, 4, 5}
	slice := []int{1, 2, 3, 4, 5}

	changeArray(array) //array를 대입받은 array2가 생성된다.(값을 복사)
	changeSlice(slice)

	fmt.Println(array)
	fmt.Println(slice)
}
