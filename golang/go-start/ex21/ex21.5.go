package main

import (
	"fmt"
)

func main() {
	i := 0
	//함수 리터럴
	f := func() {
		//변수 상태를 가져온다 = 외부 변수의 상태를 가져와 사용할 수 있다.
		i += 10
	}
	i++
	//함수 리터럴로 선언한 함수 호출
	f()
	//11 출력
	fmt.Println(i)
}
