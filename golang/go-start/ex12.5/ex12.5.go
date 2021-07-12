package main

import "fmt"

func main() {
	a := [5]int{1, 2, 3, 4, 5}
	b := [5]int{500, 400, 300, 200, 100}
	for i, v := range a {
		fmt.Printf("a[%d] = %d\n", i, v)
	}
	fmt.Println()
	for i, v := range b {
		fmt.Printf("b[%d] = %d\n", i, v)
	}
	//1. a의 값을 복사한다.(5 * 8bytes = 40 bytes)
	//2. 그대로 복사한 값을 b의 값에 넣는다.
	//3. a와 b의 값이 동일하지 않다면 복사를 할 수 없다.
	//공간 크기가 같아야 복사가 가능하다.
	b = a
	fmt.Println()
	for i, v := range b {
		fmt.Printf("b[%d] = %d\n", i, v)
	}
}
