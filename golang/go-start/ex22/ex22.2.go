package main

import (
	"container/list"
	"fmt"
)

//practice : 리스트를 이용하여 Queue 만들기
type Queue struct {
	v *list.List
}

//Input
func (q *Queue) Push(val interface{}) {
	q.v.PushBack(val)
}

//Output
func (q *Queue) Pop() interface{} {
	front := q.v.Front()
	if front != nil {
		return q.v.Remove(front)
	}
	return nil
}
func NewQueue() *Queue {
	return &Queue{list.New()}
}
func main() {
	queue := NewQueue()
	for i := 1; i < 5; i++ {
		queue.Push(i)
	}
	v := queue.Pop()
	for v != nil {
		fmt.Printf("%v ->", v)
		v = queue.Pop()
	}

}
