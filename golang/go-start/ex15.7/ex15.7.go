package main

import "fmt"

func main() {
	str := "Hello 월드"

	//len()은 바이트의 길이를 반환한다.
	//한글은 utf-8에서 2~3바이트이다.
	//즉 문자값이 우리가 아는 문자로 출력되지 않는다.
	for i := 0; i < len(str); i++ {
		fmt.Printf("타입 : %T, value : %d, 문자값 : %c\n", str[i], str[i], str[i])
	}
}
