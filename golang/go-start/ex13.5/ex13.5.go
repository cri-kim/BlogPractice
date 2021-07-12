package main

import "fmt"

type Student struct {
	Name string
	Age  int
}

func main() {
	student1 := Student{"김하나", 23}
	student2 := Student{"박하나", 13}
	student3 := Student{"최둘", 44}
	student1 = student2
	fmt.Println(student1)

	student1.Age = student3.Age
	fmt.Println(student1)

}
