package main

import "fmt"

func main() {
	str := "Hello 월드"
	//rune 은 int32의 별칭타입이다.
	//int32의 배열로 만든것이다.
	arr := []rune(str)
	//[]타입정의 -> 동적배열

	for i := 0; i < len(arr); i++ {
		fmt.Printf("타입 : %T, value : %d, 문자값 : %c\n", arr[i], arr[i], arr[i])
	}
	arr2 := []int32(str)

	//int32와 같은지 확인
	for i := 0; i < len(arr2); i++ {
		fmt.Printf("타입 : %T, value : %d, 문자값 : %c\n", arr[i], arr[i], arr[i])
	}

	//문자 순회
	for _, v := range str {
		fmt.Printf("타입 : %T, value : %d, 문자값 : %c\n", v, v, v)
	}
}
