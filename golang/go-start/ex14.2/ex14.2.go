package main

import "fmt"

func main() {
	var a int = 10
	var b int = 20
	var p1 *int = &a
	var p2 *int = &a
	var p3 *int = &b
	// == 연산으로 포인터 값을 비교할 수 있다.
	fmt.Printf("p1 == p2 : %v\n", p1 == p2)
	fmt.Printf("p2 == p3 : %v\n", p2 == p3)
}
