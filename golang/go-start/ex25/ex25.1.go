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
	//main 이 아닌 go루틴
	//lock 필요없이 채널 간 데이터 공유
	go square(&wg, ch)
	ch <- 9
	wg.Wait()
}

func square(wg *sync.WaitGroup, ch chan int) {
	n := <-ch

	time.Sleep(time.Second)
	fmt.Println("Square : ", n*n)
	wg.Done()
}
