package main

import (
	"fmt"
)

func main() {
	//맵을 생성하기 위한 초기화
	m := make(map[int]int)

	m[1] = 0

	m[2] = 2
	m[3] = 3
	delete(m, 3)
	delete(m, 4)  //없는 키 삭제 = 그냥 없음
	v, ok := m[3] //값과 bool 값을 같이 받아 확인 가능하다.
	fmt.Println(v, ok)
	fmt.Println(m[1])
}
