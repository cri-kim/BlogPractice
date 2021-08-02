package main

import (
	"fmt"
)

type PasswordError struct {
	Len        int
	RequireLen int
}

func (err PasswordError) Error() string {
	return "암호 길이가 짧습니다."
}
func RegisterAccount(name, password string) error {
	if len(password) < 8 {
		//custom error 반환
		//아래 세가지는 다 동일하다.
		//return fmt.Errorf("~")
		//return errors.New("~")
		//단, 에러 객체를 직접 만들어 반환하는 것일 뿐이다.
		return PasswordError{len(password), 8}
	}
	return nil
}
func main() {
	err := RegisterAccount("myID", "myPw")
	if err != nil {
		//타입변환 성공여부 확인과 성공시 객체 반환
		if errInfo, ok := err.(PasswordError); ok {
			fmt.Printf("%v Len:%d RequireLen:%d\n", errInfo, errInfo.Len, errInfo.RequireLen)
		} else {
			fmt.Println("회원가입되었습니다.")
		}

	}
}
