package main

import (
	"fmt"
	"unsafe"
)

type User struct {
	A int8 //1
	B int  //8
	C int8 //1
	D int  //8
	E int8 //1
} //19 -> 40bytes
type User2 struct {
	A int8 //1
	C int8 //1
	E int8 //1
	D int  //8
	B int  //8
} //19 -> 24bytes
func main() {
	var user User
	fmt.Println(unsafe.Sizeof(user))
	var user2 User2
	fmt.Println(unsafe.Sizeof(user2))
}
