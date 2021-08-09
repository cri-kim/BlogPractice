package main

import (
	"fmt"
	"time"
)

func main() {
	//0개짜리 채널생성
	ch := make(chan int)

	go square()
	//채널에 값을 계속 넣음...근데 채널의 값을 가져가는 것이 없다.
	//채널 값을 가져가는 것이 없어 대기중
	//무한대기
	ch <- 9
	//채널 무한대기로 출력안됌
	fmt.Println("Never print")
}
func square() {
	for {
		time.Sleep(2 * time.Second)
		fmt.Println("sleep")
	}
}
