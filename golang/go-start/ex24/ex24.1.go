package main

import (
	"fmt"
	"time"
)

func PrintHangul() {
	hanguls := []rune{'가', '나', '다', '라', '마', '바', '시'}
	for _, v := range hanguls {
		time.Sleep(300 * time.Millisecond)
		fmt.Printf("%c", v)
	}
}
func PrintNumbers() {
	for i := 1; i <= 5; i++ {
		time.Sleep(400 * time.Millisecond)
		fmt.Printf("%d", i)
	}
}
func main() {
	//go routine 실행
	go PrintHangul()
	//go routine 실행
	go PrintNumbers()

	//main 함수 3초간 대기
	//time.Sleep(3 * time.Second)
}
