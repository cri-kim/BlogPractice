package main

import (
	"fmt"
	"sync"
	"time"
)

type Job interface {
	Do()
}
type SquareJob struct {
	index int
}

func (j *SquareJob) Do() {
	fmt.Printf("%d 작업시작\n", j.index)
	time.Sleep(1 * time.Second)
	fmt.Printf("%d 작업완료 - 결과 %d\n", j.index, j.index*j.index)

}
func main() {
	//영역을 나누는 방법
	var jobList [10]Job
	for i := 0; i < 10; i++ {
		jobList[i] = &SquareJob{i}
	}
	var wg sync.WaitGroup
	wg.Add(10)

	for i := 0; i < 10; i++ {
		go jobList[i].Do()
	}
	wg.Wait()
}
