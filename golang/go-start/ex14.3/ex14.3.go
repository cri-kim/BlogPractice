package main

import "fmt"

type Data struct {
	value int
	data  [200]int
}

func ChangeDate(arg Data) {
	arg.value = 999
	arg.data[100] = 999
}
func ChangeDate2(arg *Data) {
	arg.value = 999
	arg.data[100] = 999
}
func main() {
	var data Data
	ChangeDate(data)
	fmt.Printf("value = %d\n", data.value)
	fmt.Printf("data[100] = %d\n", data.data[100])

	ChangeDate2(&data)
	fmt.Printf("value = %d\n", data.value)
	fmt.Printf("data[100] = %d\n", data.data[100])
}
