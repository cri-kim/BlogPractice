package main

import "fmt"

var cnt int = 0

func IncreaseAndReturn() int {
	fmt.Println("IncreaseAndReturn()", cnt)
	cnt++
	return cnt
}

func main() {
	if false && IncreaseAndReturn() < 5 {
		fmt.Println("1 증가")
	}
	//좌변이 false여서 우측은 실행이 되지 않았다.

	if true && IncreaseAndReturn() < 5 {
		fmt.Println("1 증가")
	}

	if false || IncreaseAndReturn() < 5 {
		fmt.Println("1 증가")
	}

	if true || IncreaseAndReturn() < 5 {
		fmt.Println("1 증가")
	}
	// 쇼트 서킷 발생!
	//1 증가가 출력됬지만, 앞에 true여서 좌변의 함수가 실행되지 않아
	//cnt 는 증가하지 않는다.

}
