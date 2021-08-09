package main

import (
	"fmt"
	"sync"
	"time"
)

func main() {
	var wg sync.WaitGroup
	ch := make(chan int)

	wg.Add(1)
	go square(&wg, ch)

	for i := 1; i < 10; i++ {
		ch <- i * 2
	}
	close(ch)
	wg.Wait() //메인 고루틴의 중단
}
func square(wg *sync.WaitGroup, ch chan int) {
	tick := time.Tick(time.Second)            //1초에 한번씩 신호가 옴
	terminate := time.After(10 * time.Second) //10초에 한번씩 채널 반환
	for {
		select {
		case <-tick: //tick에서 데이터를 뽑을 수 있는 경우,
			fmt.Println("tick")
		case <-terminate:
			fmt.Println("Terminated")
			wg.Done() //10초 지나면 프로그램 종료
			return
		case n := <-ch:
			fmt.Println("Square : ", n*n) //채널에 들어온 데이터 출력
			time.Sleep(time.Second)
		}
	}
	wg.Done()
}
