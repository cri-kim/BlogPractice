package main

import "fmt"

func main() {
	tem := 33
	if temp > 28 {
		fmt.Println("에어컨을 켠다")
	} else if temp <= 3 {
		fmt.Println("히터를 켠다")
	} else if temp <= 18 { // 3 < temp <= 18
		fmt.Println("나가자!")
	} else { // 18 < temp <=28
		fmt.Println("덥다")
	}
}
