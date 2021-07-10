package main

import "fmt"

func main() {
	//보통 반복할때 변수를 i로 선언한다.
	//i는 iterator(반복자)의 약자이다.
	for i := 0; i < 10; i++ {
		fmt.Print(i, ",")
	}
}
