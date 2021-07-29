package custompkg

import (
	"fmt"

	"ex16.5/exinit"
)

func PrintCustom() {
	exinit.PrintD()
	fmt.Println("This is custom package!")
}
