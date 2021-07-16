package main

import (
	"fmt"
	"reflect"
	"unsafe"
)

func main() {
	str1 := "Hello 월드"
	var slice []byte = []byte(str1)

	stringHeader1 := (*reflect.StringHeader)(unsafe.Pointer(&str1))
	stringHeader2 := (*reflect.StringHeader)(unsafe.Pointer(&slice))

	fmt.Printf("str:\t%x\n", stringHeader1.Data)
	fmt.Printf("slice:\t%x\n", stringHeader2.Data)
}
