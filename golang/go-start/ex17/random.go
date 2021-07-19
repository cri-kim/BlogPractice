package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	t := time.Now()
	rand.Seed(t.UnixNano())
	for i := 0; i < 10; i++ {
		fmt.Print(rand.Intn(100), ", ")
	}
}
