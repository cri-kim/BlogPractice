package main

import "fmt"

func printNo(n int) {
	if n == 0 { //재귀 호출 탈출 조건
		return
	}
	fmt.Println(n)
	printNo(n - 1)
	fmt.Println("After", n)
}

func main() {
	printNo(3)
}
