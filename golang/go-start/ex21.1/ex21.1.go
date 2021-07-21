package main

import (
	"fmt"
)

func sum(nums ...int) int {
	sum := 0
	fmt.Printf("nums type : %T\n", nums)
	for _, v := range nums {
		sum += v
	}
	return sum
}

func main() {
	//함수종료전 실행보장
	defer fmt.Println("TEST")

	fmt.Println(sum(1, 2, 3, 4, 5))
	fmt.Println(sum(10, 20))
	fmt.Println(sum())
}
