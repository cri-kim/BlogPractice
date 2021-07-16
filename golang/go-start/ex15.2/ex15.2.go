package main

import "fmt"

func main() {
	poet1 := "죽는날까지 하늘을 우러러\n 글을 작성중입니다.\n 매우 긴 글입니다.\n 반가워요"

	poet2 := `이걸로도 문자를 작성할 수 있어요.
			쌍따음표는 한줄에 작성하지만
			이 친구는 여러줄도 지원해요.
			대신 이 친구는 특수문자로 행 변경같은거 \n 못해요`

	fmt.Println(poet1)
	fmt.Println(poet2)
}
