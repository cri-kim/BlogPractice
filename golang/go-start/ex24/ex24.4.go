//동시성 문제를 알아보자..너무졸립니다. 살려주세요.
package main

import (
	"fmt"
	"sync"
	"time"
)

type Account struct {
	Balance int
}

func main() {
	var wg sync.WaitGroup
	mutex := &sync.Mutex{}

	account := &Account{10}
	wg.Add(10)
	for i := 0; i < 10; i++ {
		go func() {
			//무한루프
			for {
				DepositAndWithdraw(account, mutex)
			}
			wg.Done()
		}()
	}
	wg.Wait()
}
func DepositAndWithdraw(account *Account, mutex *sync.Mutex) {
	mutex.Lock()
	defer mutex.Unlock()
	if account.Balance < 0 {
		panic(fmt.Sprintf("Balance shoul not be negative value : %d", account.Balance))
	}
	account.Balance += 1000
	time.Sleep(time.Millisecond)
	account.Balance -= 1000
}
