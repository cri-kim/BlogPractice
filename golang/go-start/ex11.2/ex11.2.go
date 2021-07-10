package main

import (
	"fmt"
	"time"
)

func main() {
	i := 1
	//무한루프
	for {
		time.Sleep(time.Second) //threa를 시간만큼 멈춘다.
		fmt.Println(i)
		i++
	}
}
