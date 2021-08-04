package main

import (
	"fmt"
	"math/rand"
	"sync"
	"time"
)

var wg sync.WaitGroup

func main() {
	rand.Seed(time.Now().UnixNano())

	wg.Add(2)
	fork := &sync.Mutex{}
	spoon := &sync.Mutex{}

	go diningProblem("A", fork, spoon, "포크", "수저")
	go diningProblem("B", spoon, fork, "수저", "포크")
	wg.Wait()
}
func diningProblem(name string, first, second *sync.Mutex, firstname, secondname string) {
	for i := 0; i < 100; i++ {
		fmt.Printf("%s 가 밥을 먹으려고한다.\n", name)
		first.Lock()
		fmt.Printf("%s 를 휙득하였다.\n", name)
		second.Lock()
		fmt.Printf("%s 를 휙득하였다.\n", name)

		time.Sleep(time.Duration(rand.Intn(1000)) * time.Millisecond)
		second.Unlock()
		first.Unlock()
	}
}
