package main

import (
	"fmt"
)

func add(a, b int) int {
	return a + b
}
func mul(a, b int) int {
	return a * b
}

//func(int, int) int 타입의 함수를 반환하는 함수
func getOperator(op string) func(int, int) int {
	if op == "+" {
		return add
	} else if op == "*" {
		return mul
	} else {
		return nil
	}
}
func main() {
	//함수 타입의 변수 생성
	var operator func(int, int) int
	operator = getOperator("+")

	var result = operator(3, 4)
	fmt.Println(result)
}
