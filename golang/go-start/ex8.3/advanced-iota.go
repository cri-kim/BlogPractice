package main

import "fmt"

const (
	MasterRoom uint8 = 1 << iota
	LivingRoom
	BathRoom
	SmallRoom
)

func SetLight(rooms, room uint8) uint8 {
	return rooms | room
}
func ResetLight(rooms, room uint8) uint8 {
	//bit clear
	return room &^ room
}
func IsLightOn(rooms, room uint8) bool {
	return rooms&room == room
}
func TurnLights(rooms uint8) {
	if IsLightOn(rooms, MasterRoom) {
		fmt.Println("안방에 불을 켠다")
	}
	if IsLightOn(rooms, LivingRoom) {
		fmt.Println("거실에 불을 켠다")
	}
	if IsLightOn(rooms, BathRoom) {
		fmt.Println("화장실에 불을 켠다")
	}
	if IsLightOn(rooms, SmallRoom) {
		fmt.Println("작은방에 불을 켠다")
	}
}

//bit 단위로 의미를 부여할 수 있다.
func main() {
	var rooms uint8 = 0                 //모든 bit 0
	rooms = SetLight(rooms, MasterRoom) //0000 0001
	rooms = SetLight(rooms, LivingRoom) //0000 0010
	rooms = SetLight(rooms, BathRoom)   //0000 0100
	rooms = SetLight(rooms, SmallRoom)  //0000 1000

	rooms = ResetLight(rooms, MasterRoom)

	TurnLights(rooms)

}
