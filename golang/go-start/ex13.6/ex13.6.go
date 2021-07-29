package main

import (
	"fmt"
	"unsafe"
)

type User struct {
	Age   int32   //4bytes
	Score float64 //8bytes
} //12bytes?

func main() {
	var a int = 56
	user := User{23, 77.2}
	//user 16 bytes?
	fmt.Println(unsafe.Sizeof(user), unsafe.Sizeof(a))

}
