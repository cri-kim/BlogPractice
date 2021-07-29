package main

import "fmt"

type ColorType int //별칭 선언 - 현재 선언하는 타입의 의미를 명확하게 하기 위해 지정
const (
	Red ColorType = iota
	Blue
	Green
	Yellow
)

func colorToString(color ColorType) string {
	switch color {
	case Red:
		return "Red"
	case Blue:
		return "Red"
	case Green:
		return "Green"
	case Yellow:
		return "Yellow"
	default:
		return "Undefinedd"
	}
}

func getMyFavoiteColor() ColorType {
	return Red
}

func getSwitchFunction(value int) {
	switch value {
	case 1:
		fmt.Print("hello")
	case 2:
		fmt.Print("hello2")
	case 3:
		fmt.Print("hello3")
		break
	case 4:
		fmt.Print("hello4")
		fallthrough
	default:
		fmt.Print("end")
	}
}
func main() {
	getSwitchFunction(4)
	//fmt.Println("My favorite color is ", colorToString(getMyFavoiteColor()))
	//fmt.Println("Next is ", colorToString(2))
	//fmt.Println("And ", colorToString(Yellow))
}
