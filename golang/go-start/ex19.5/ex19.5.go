package main

import "fmt"

type account struct {
	balance   int
	firstname string
	lastname  string
}

func (a1 *account) widthdrawPointer(amount int) {
	a1.balance -= amount
}

func (a2 account) widthdrawValue(amount int) {
	a2.balance -= amount
}

func main() {
	var mainA *account = &account{100, "joe", "park"}
	mainA.widthdrawPointer(30)
	fmt.Println(mainA.balance)

	mainA.widthdrawValue(20)
	fmt.Print(mainA.balance)
}
