package main

import (
	"fmt"
)

const M = 10

//해쉬 함수를 생성
func hash(d int) int {
	//mod
	return d % M
}

func main() {
	m := [M]string{}

	//해시함수로 맵 정의
	//일정한 속도로 조회 가능
	m[hash(23)] = "송하나"
	m[hash(259)] = "백두산"

	fmt.Printf("%d = %s\n", 23, m[hash(23)])
	fmt.Printf("%d = %s\n", 259, m[hash(259)])
}
