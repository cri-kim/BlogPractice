package main

import "fmt"

func main() {
	//배열 초기값 선언
	var t [5]float64 = [5]float64{24.0, 25.9, 27.8, 26.9, 26.2}

	//배열의 인덱스는 0부터 시작한다.
	//이를 이용하여 인덱스로 배열의 모든 값을 확인하는 반복문이다.
	for i := 0; i < 5; i++ {
		fmt.Println(t[i])
	}
	defineArray()
}

//다양한 배열 변수 선언
func defineArray() {
	//0 0 0 0 0
	var nums [5]int

	//초기값 선언
	days := [3]string{"monday", "tuesday", "wednesday"}

	//24.3 26.7 0 0 0
	var temps [5]float64 = [5]float64{24.3, 26.7}

	//특정 인덱스에 값을 선언
	//0 10 0 30 0
	var s = [5]int{1: 10, 3: 30}

	//[...]은 선언된 초깃값의 갯수가 배열의 길이가 된다
	// FOCUS. []int{10,20,30}과 동일하지 않다.
	//[]int{10,20,30} 은  SLICE로 동적 배열이며 길이가 변할 수 있다.
	x := [...]int{10, 20, 30}
}
