package main

import (
	"container/list"
	"fmt"
)

func main() {
	v := list.New()
	e4 := v.PushBack(4)   //4라는 요소 삽입
	e1 := v.PushBack(1)   //1이라는 요소 삽입
	v.InsertBefore(3, e4) //3이라는 값을 e4 전에 삽입
	v.InsertAfter(2, e1)  //2라는 값을 e1 후에 삽입

	for e := v.Front(); e != nil; e = e.Next() {
		fmt.Print(e.Value, " ")
	}

	fmt.Println()
	//reverse print
	for e := v.Back(); e != nil; e = e.Prev() {
		fmt.Print(e.Value, " ")
	}

}
