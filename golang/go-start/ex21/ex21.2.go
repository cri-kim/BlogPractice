package main

import (
	"fmt"
	"os"
)

func main() {
	//파일이 없으면, 파일 생성
	//파일이 있으면, 파일 로드
	f, err := os.Create("test.txt")
	if err != nil {
		fmt.Println("Failed to create a file", err)
		return
	}
	defer fmt.Println("반드시 호출됩니다.")
	defer f.Close()
	defer fmt.Println("File close.")

	fmt.Println("write 'hello world' in the file.")
	//출력스트림을 정하여 파일에 데이터를 저장할 수 있다.
	fmt.Fprintln(f, "Hello world")
}
