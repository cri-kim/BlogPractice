package main

import (
	"bufio"
	"errors"
	"fmt"
	"strconv"
	"strings"
)

//에러처리에 관한 예제 + string 처리에 관한 예제
func MultipleFromString(str string) (int, error) {
	//scanner는 일정한 한줄/한구문씩 string을 가져오기 좋은 함수이다.
	scanner := bufio.NewScanner(strings.NewReader(str))
	scanner.Split(bufio.ScanWords)

	pos := 0
	a, n, err := readNextInt(scanner)
	if err != nil {
		return 0, fmt.Errorf("Failed to readNextInt(), pos: %d err:%w", pos, err)
	}
	pos += n + 1
	b, n, err := readNextInt(scanner)
	if err != nil {
		return 0, fmt.Errorf("Failed to readNextInt(), pos: %d err:%w", pos, err)
	}
	return a * b, nil
}

//다음 단어를 읽서 숫자로 변환하여 반환한다.
//반환된 숫자, 읽은 글자 수, 에러를 반환합니다.
func readNextInt(scanner *bufio.Scanner) (int, int, error) {
	if scanner.Scan() {
		return 0, 0, fmt.Errorf("Failed to scan")
	}
	//읽은 값을 문자열로 받아온다.
	word := scanner.Text()
	//문자열을 숫자(integer)로 바꾼다. -> 숫자모양의 문자가 아닐 경우, 에러 반환
	numer, err := strconv.Atoi(word)
	if err != nil {
		return 0, 0, fmt.Errorf("Failed to convert word to int, word:%s, err:%w", word, err)
	}
	return numer, len(word), nil
}
func readEq(eq string) {
	rst, err := MultipleFromString(eq)
	if err == nil {
		fmt.Println(rst)
	} else {
		fmt.Println(err)
		var numError *strconv.NumError
		//errors.As 를 이용하여 내부에서 에러 래핑되어있는 것을 변환해서 넣어준다.
		if errors.As(err, &numError) {
			fmt.Println("NumberError", numError)
		}
	}
}
func main() {
	readEq("123 3")
	readEq("123 abc")
}
