package main

import (
	"fmt"
)

//이름은 동일하지만 호출할때 들어가는 슬라이스 값과 가리키는 주소값이 다르다.
//새로운 주소값을 참조하는 슬라이스를 만든다.
func addNum(slice []int) {
	slice = append(slice, 4)
}

//메모리 주소 값을 가져가서 주소값의 데이터를 변경한다.
func addNum1(slice *[]int) {
	*slice = append(*slice, 4)
}

//생성한 새로운 슬라이스를 반환한다.
func addNum2(slice []int) []int {
	slice = append(slice, 4)
	return slice
}

func main() {
	slice := []int{1, 2, 3}
	addNum(slice)
	fmt.Println(slice)

	addNum1(&slice)
	fmt.Println(slice)

	slice = addNum2(slice)
	fmt.Println(slice)
}
