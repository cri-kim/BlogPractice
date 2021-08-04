package main

import (
	"fmt"
	"sync"
)

var wg sync.WaitGroup

func SumAtoB(a, b int) {
	sum := 0
	for i := 1; i < b; i++ {
		sum += i
	}
	fmt.Printf("%d부터 %d까지 합계는 %d입니다.\n", a, b, sum)
	wg.Done() //고루틴 종료
}

func main() {
	//10개의 고루틴 생성
	wg.Add(10)
	for i := 0; i < 10; i++ {
		go SumAtoB(1, 10000000)
	}
	//go routine이 끝날때까지 대기
	wg.Wait()
}
