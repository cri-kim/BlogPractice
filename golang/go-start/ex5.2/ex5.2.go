package main

import "fmt"

func main() {
	var a int = 10
	var b int = 20
	var f float64 = 32323.123123000001

	fmt.Print("a : ", a, ",b: ", b, ",f : ", f)
	fmt.Println("a : ", a, ",b : ", b, ",f : ", f)
	fmt.Printf("a: %d, b: %d, f:%f", a, b, f)
}
