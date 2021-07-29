package main

import "fmt"

const Pig int = 0
const Cow int = 1
const Chicken int = 2

//iota1
const (
	Red   int = iota //0
	Blue  int = iota //1
	Green int = iota //2
)

//iota2
const (
	C  uint = iota + 1 //1 = 0+1
	C2                 //2 = 0+2
	C3                 //3 = 0+3
)

const (
	BitFlag1 uint = 1 << iota //1 = 1 << 0 -> 0000 0001
	BitFlag2                  //2 = 1 << 1 -> 0000 0010
	BitFlag3                  //4 = 1 << 2 -> 0000 0100
	BitFlag4                  //8 = 1 << 3 -> 0000 1000
)

func main() {
	PrintAnimal(0)
	PrintAnimal(1)
	PrintAnimal(2)
	PrintAnimal(Red)
	PrintAnimal(Blue)
	PrintAnimal(Green)
	PrintAnimal(int(C))
	PrintAnimal(int(C2))
	PrintAnimal(int(C3))
}
func PrintAnimal(animal int) {
	if animal == Pig {
		fmt.Println("꿀꿀")
	} else if animal == Cow {
		fmt.Println("음메")
	} else {
		fmt.Println("꼬끼오")
	}
}
