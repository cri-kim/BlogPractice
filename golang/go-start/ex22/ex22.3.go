package main

import (
	"container/list"
	"fmt"
)

//practice : 리스트를 이용하여 Stack 만들기
type Stack struct {
	v *list.List
}

//Input
func (s *Stack) Push(val interface{}) {
	s.v.PushBack(val)
}

//Output
func (s *Stack) Pop() interface{} {
	back := s.v.Back()
	if back != nil {
		return s.v.Remove(back)
	}
	return nil
}
func NewStack() *Stack {
	return &Stack{list.New()}
}
func main() {
	stack := NewStack()
	books := [5]string{"어린왕자", "겨울왕국", "노인과바다", "짱구", "빨간머리앤"}
	for _, book := range books {
		stack.Push(book)
	}
	v := stack.Pop()
	for v != nil {
		fmt.Printf("%v ->", v)
		v = stack.Pop()
	}

}
