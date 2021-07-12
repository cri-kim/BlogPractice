package main

import "fmt"

type account struct {
	balance int
}

func withDrawFunc(a *account, amount int) {
	a.balance -= amount
}
func (a *account) withDrawMethod(amount int) {
	a.balance -= amount
}
func main() {
	//account 인스턴스 초기화
	a := &account{100} //*account
	withDrawFunc(a, 30)
	fmt.Println(a.balance)
	a.withDrawMethod(30)
	fmt.Println(a.balance)
}
