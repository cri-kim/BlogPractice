package main

import (
	"bufio"
	"fmt"
	"os"
)

func ReadFile(filename string) (string, error) {
	file, err := os.Open(filename)
	if err != nil {
		return "", err
	}
	//close file
	defer file.Close()

	rd := bufio.NewReader(file)

	//한줄씩 읽고 반환
	line, _ := rd.ReadString('\n')
	return line, nil
}
func WriteFile(filename string, line string) error {
	file, err := os.Create(filename)
	if err != nil {
		return err
	}
	//close file
	defer file.Close()

	//한줄을 쓰고 반환
	_, err = fmt.Fprintln(file, line)
	return err
}

const filename string = "data.txt"

func main() {
	line, err := ReadFile(filename)
	if err != nil {
		err = WriteFile(filename, "This is WriteFile.")
		if err != nil {
			fmt.Println("파일 생성에 실패하였습니다.", err)
			return
		}
		line, err = ReadFile(filename)
		if err != nil {
			fmt.Println("파일 읽기에 실패하였습니다.", err)
			return
		}
	}
	fmt.Println("파일 내용은 :", line)
}
