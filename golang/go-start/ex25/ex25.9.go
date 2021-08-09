package main

import (
	"context"
	"fmt"
	"sync"
)

var wg sync.WaitGroup

func main() {
	wg.Add(1)
	//어떤 데이터를 지정할 수 있다.
	ctx := context.WithValue(context.Background(), "number", 9)
	go square(ctx)
	wg.Wait()
}
func square(ctx context.Context) {
	if v := ctx.Value("number"); v != nil {
		n := v.(int)
		fmt.Printf("Square : %d", n*n)
	}
	wg.Done()
}
