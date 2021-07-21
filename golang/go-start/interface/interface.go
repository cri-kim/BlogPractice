package main

import (
	"fmt"
)

/*
	interface 강의를 놓쳐서(안들어서..) 독학용
	참고 : http://golang.site/

	interface : 구조체(struct)가 필드의 집합체라면, interface는 메서드의 집합체이다.
	interface는 타입이 구현해야 하는 메서드 원형들을 정의한다.
*/

//type 정의
type Tire struct {
	price    float64
	location int
	stat     bool
}

//1.인터페이스는 type문을 사용하여 정의한다
type Car interface {
	setTire() float64
}

//2.인터페이스 구현
//Car 인터페이스에 있는 메서드에 대해 구현을 하면, 해당 인터페이스에 대한 구현을 하는 것이다.
func (t Tire) setTire() float64 {
	//보통은 뭔가 동작이 있겠지요.
	return t.price
}
func showCar(cars ...Car) {
	for _, s := range cars {
		a := s.setTire()
		fmt.Println(a)
	}
}

func main() {
	//3. 인터페이스 사용
	tire := Tire{100000, 1, true}
	showCar(tire)
}

//4. 인터페이스 타입
//4-1. 빈 인터페이스(empty interface)
//메서드를 전혀 갖지 않은 빈 인터페이스이다. 주로 모든 type 을 나타내기 위해 사용한다.
//Dynamic Type으로 생각할 수 있다.
//C#, JAVA 의 Object, General로 생각 할 수 있다.

//5. type Assersion
