package main

import (
	"fmt"
)

type OpFn func(int, int) int

//함수 리터럴 사용
func getOperator(op string) OpFn {
	if op == "+" {
		return func(a, b int) int {
			return a + b
		}
	} else if op == "*" {
		return func(a, b int) int {
			return a * b
		}
	} else {
		return nil
	}
}
func main() {
	//함수 타입의 변수 생성
	var operator OpFn
	operator = getOperator("+")

	var result = operator(3, 4)
	fmt.Println(result)
}
