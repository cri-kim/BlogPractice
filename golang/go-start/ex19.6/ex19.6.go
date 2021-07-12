package main

import (
	"fmt"
	"time"
)

type User struct {
	Name string
	Age  int
}

type VIPUser struct {
	User     //enbedded field
	VIPLevel int
}

func (u User) String() string {
	return fmt.Sprintf("%s, %d", u.Name, u.Age)
}
func (v VIPUser) vipLevel() int {
	return v.VIPLevel
}
func main() {
	//생성자가 없기 때문에 초기값선언에 답은 없다.
	var t1 = time.Timer{}
	var t2 = time.NewTicker(time.Second)
	fmt.Println(t1)
	fmt.Println(t2)

	vip := VIPUser{User{"Hwarang", 34}, 5}
	fmt.Println(vip.String())

}
