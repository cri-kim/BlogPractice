package main

import "fmt"

func getMyAge() int {
	return 22
}
func main() {
	switch age := getMyaAge(); age {
	case 10:
		fmt.Println("Teenage")
	case 33:
		fmt.Println("Pair 3")
	default:
		fmt.Println("My age is", age)
	}
	//fmt.Println("age is",age) //ERROR - 초기값 선언된 age 변수는 스위치문을 나오면 사라진다.
}
