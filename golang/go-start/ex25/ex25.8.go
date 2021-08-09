package main

import (
	"context"
	"fmt"
	"sync"
	"time"
)

var wg sync.WaitGroup

func main() {
	wg.Add(1)
	//취소 가능한 컨텍스트 생성
	ctx, cancel := context.WithCancel(context.Background())
	go PrintEverySecond(ctx)
	time.Sleep(5 * time.Second)
	cancel()

	wg.Wait()
}
func PrintEverySecond(ctx context.Context) {
	tick := time.Tick(time.Second)
	for {
		select {
		case <-ctx.Done(): //작업이 끝날때 신호가 온다.
			wg.Done()
			return
		case <-tick:
			fmt.Println("tick")
		}
	}
}
