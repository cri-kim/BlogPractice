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
	//무한하게 데이터를 채널에서 가져오려고 대기
	for n := range ch {
		fmt.Println("Square : ", n*n)
		time.Sleep(time.Second)
	}
	wg.Done()
}

//데드락 발생
