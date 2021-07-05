//set code package.
//it means program start-point in package "main"
package main

//load go pakage(have functions)
import "fmt"

func main() {
	//print a string to the screen
	//go run hello.go => run the go script
	//go build => buiild the go project. but you must have go module
	//go mod init {modulename} => make go module
	fmt.Println("Hello world!")
}
