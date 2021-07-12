package main

import "fmt"

func main() {
	nums := [...]int{10, 20, 30, 40, 50} // = [5]int{10,20,30,40,50}
	nums[2] = 300

	//len()은 배열의 길이를 반환하는 내장함수이다.
	for i := 0; i < len(nums); i++ {
		fmt.Println(nums[i])
	}

	var t [5]float64 = [5]float64{24.0, 25.9, 27.8, 26.9, 26.2}

	//range(범위)는 키워드 이다.
	//range 뒤에는 자료구조/타입이 올 수 있다.
	//range 뒤에 오는 자료구조 요소를 순회한다.
	//배열의 경우, 인덱스와 값으로 이루어진 자료구조이다.
	//range 뒤에 배열이 오면 인덱스와 값을 반환하게된다.
	for _, v := range t {
		fmt.Println(v)
	}
}
