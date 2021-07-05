package main

import "fmt"

func main() {
	var slice []int //처음 초기화시, 슬라이스의 길이는 0이다.

	if len(slice) == 0 {
		fmt.Println("slice is empty", slice)
	}

	//slice[1] = 10 // 실행한다면 runtime 에러가 날 것이다.(길이 초과)
	fmt.Println(slice)

	slice = []int{1, 2, 3} //slice에 1,2,3을 넣는다.
	fmt.Println(slice)

}
