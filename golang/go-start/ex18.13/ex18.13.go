package main

import (
	"fmt"
	"sort"
)

type Student struct {
	Name string
	Age  int
}
type Students []Student

func (s Students) Len() int { return len(s) }

//func (s Students) Less() int{return s[i]> Age}
func (s Students) Swap() int { return len(s) }

func main() {
	s := []Student{
		{"화랑", 31},
		{"백두산", 52},
		{"류", 39},
		{"켄", 12},
		{"송하나", 18},
	}
	sort.Sort(Student(s))
	//sort에는 len, less, Swap 인자를 가지고 있는 경우만 사용 가능하다.
	fmt.Println(s)
}
