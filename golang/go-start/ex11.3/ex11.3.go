package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	stdin := bufio.NewReader(os.Stdin)
	for {
		fmt.Println("숫자를 입력하세요")
		var number int
		_, err := fmt.Scanln(&number)
		//_는 빈칸제시자
		//scanner를 사용하면 입력값과 err 값이 변수에 필요하다.
		//입력값이 필요 없는 경우, _(빈칸지시자)로 변수를 선언해 주어 에러를 막는다.
		if err != nil {
			fmt.Println("숫자로 입력하세요")
			stdin.ReadString('\n')
			continue
		}
		fmt.Printf("입력하신 숫자는 %d 입니다.", number)
		if number%2 == 0 { //짝수일 경우, break를 통해 반복문 탈출
			break
		}
	}
	fmt.Printf("for 문 종료")
}
