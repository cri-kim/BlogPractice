package main

import (
	"ex16.5/custompkg"
	"ex16.5/exinit"
)

func main() {
	//custom 에서 exinit의 init 이 호출됨
	custompkg.PrintCustom()
	//exinit 의 init 은 더이상 호출되지 않음
	//init() 은 전체에서 한번 호출됨
	exinit.PrintD()
}
