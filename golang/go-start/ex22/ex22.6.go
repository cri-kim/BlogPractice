package main

import (
	"fmt"
)

type Product struct {
	Name  string
	Price int
}

func main() {
	//맵을 생성하기 위한 초기화
	m := make(map[int]Product)

	m[16] = Product{"pen", 500}

	m[46] = Product{"eraser", 500}
	m[78] = Product{"ruler", 200}
	m[345] = Product{"sharp", 1000}
	m[897] = Product{"sharp core", 500}
	for k, v := range m {
		fmt.Println(k, v)
	}

}
