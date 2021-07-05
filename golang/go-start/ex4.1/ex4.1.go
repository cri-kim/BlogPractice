package main

import "fmt" //fmt 라는 패키지를 가져오겠다.

func main() {
	var a int = 10
	var msg string = "Hello Variable"

	a = 20
	msg = "Good Morning!"
	fmt.Println(a, msg)
}
