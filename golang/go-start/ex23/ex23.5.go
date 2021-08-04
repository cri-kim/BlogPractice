package main

import (
	"errors"
	"fmt"
)

func divide(a, b int) {
	if b == 0 {
		//패닉 셋팅
		panic("b는 0일 수 없습니다.")
	}
	fmt.Printf("%d / %d = %d\n", a, b, a/b)
}

func divide2(a, b int) error {
	if b == 0 {
		return errors.New("b는 0일 수 없습니다.")
	}
	fmt.Printf("%d / %d = %d\n", a, b, a/b)
	return nil
}
func main() {
	divide2(9, 3)
	divide2(9, 0)
	divide(9, 3)
	divide(9, 0)
	//실행시, 어디서 패닉이 일어났는지 알려준다.
	//패닉은 패닉 시점에서 프로그램을 종료한다.
}
