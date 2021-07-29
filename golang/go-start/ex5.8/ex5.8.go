package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	stdin := bufio.NewReader(os.Stdin)
	//os package 내의 standard input

	var a int
	var b int

	n, err := fmt.Scanln(&a, &b)
	if err != nil {
		fmt.Println(err)
		stdin.ReadString('\n') //표준 입력버퍼에서 '\n' 문자가 나올때까지 읽기
	} else {
		fmt.Println(n, a, b)
	}

	n, err = fmt.Scanln(&a, &b)
	if err != nil {
		fmt.Println(err)
		stdin.ReadString('\n') //표준 입력버퍼에서 '\n' 문자가 나올때까지 읽기
	} else {
		fmt.Println(a, b)
	}
}
