package main

import (
	"fmt"
)

func main() {
	fmt.Println("print star(*)")
	for i := 0; i < 3; i++ {
		for j := 0; j < i+1; j++ {
			fmt.Print("* ")
		}
		fmt.Println()
	}
	//output
	//*
	//**
	//***
	fmt.Println("print InvertedTriangle")
	getInvertedTriangle()
	fmt.Println("print EquilateralTriangle")
	getEquilateralTriangle()
	fmt.Println("print EquilateralTriangle")
	getDiamond()
}

func getInvertedTriangle() {
	row := 5
	for i := 0; i < row; i++ {
		for j := row - i; j > 0; j-- {
			fmt.Print("* ")
		}
		fmt.Println()
	}
}

func getEquilateralTriangle() {
	row := 5
	for i := 0; i < row; i++ {
		for j := row - i; j > 0; j-- {
			fmt.Print(" ")
		}
		for j := 0; j < i+1; j++ {
			fmt.Print("* ")
		}
		fmt.Println()
	}
}
func getDiamond() {
	row := 5
	for i := 0; i < row; i++ {
		for j := row - i; j > 0; j-- {
			fmt.Print(" ")
		}
		for j := 0; j < i+1; j++ {
			fmt.Print("* ")
		}
		fmt.Println()
	}
	for i := 0; i < row; i++ {
		for j := 0; j < i+1; j++ {
			fmt.Print(" ")
		}
		for j := row - i; j > 0; j-- {
			fmt.Print("* ")
		}
		fmt.Println()
	}
}
