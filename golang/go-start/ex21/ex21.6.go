package main

import (
	"fmt"
)

func CaptureLoop() {
	//f slice 선언
	f := make([]func(), 3)
	fmt.Println("ValueLoop")
	for i := 0; i < 3; i++ {
		//i를 reference capture 하기 때문에
		//i의 값이 아닌 메모리 공간을 가져와 읽는다.
		f[i] = func() { fmt.Println(i) }
	}
	for i := 0; i < 3; i++ {
		f[i]()
	}
}
func CaptureLoop2() {
	f := make([]func(), 3)
	fmt.Println("ValueLoop2")
	for i := 0; i < 3; i++ {
		v := i
		f[i] = func() {
			fmt.Println(v)
		}
	}
	for i := 0; i < 3; i++ {
		f[i]()
	}
}
func main() {
	CaptureLoop()
	CaptureLoop2()
}
