package main

import (
	"fmt"
	"goproject/usepkg/custompkg"

	"github.com/guptarohit/asciigraph"
	"github.com/tuckersGo/musthaveGo/ch16/expkg"
)

func main() {
	//공개된 외부패키지의 메서드
	custompkg.PrintCustom()
	expkg.PrintSample()

	data := []float64{3, 4, 5, 6, 7, 8, 9, 6, 4, 4, 33, 1, 2, 3}
	graph := asciigraph.Plot(data)
	fmt.Println(graph)
}
