package main

import (
	"bufio"
	"fmt"
	"log"
	"net"
	"os"
	"time"
)
func socketTest(adr string) {
	in := bufio.NewReader(os.Stdin)
	fmt.Print("request = ")
	request, err := in.ReadString('\n')
	if err != nil {
		fmt.Println("request err")
	}
	conn, err := net.Dial("tcp", adr)
	if nil != err {
		log.Println(err)
	}

	defer conn.Close()

	go func(c net.Conn) {
		data := make([]byte, 4096)
		for {
			n, err := c.Read(data)
			if err != nil {
				log.Println(err)
				return
			}
			log.Println("Respones : " + string(data[:n]))
			time.Sleep(1 * time.Second)
		}
	}(conn)

	go func(c net.Conn) {
		i := 0
		for {

			//conn.Write([]byte(request))
			_, err := c.Write([]byte(request))
			if err != nil {
				log.Println(err)
				return
			}

			i++
			time.Sleep(1 * time.Second)
		}
	}(conn)

	fmt.Scanln()
}


func main() {
	for {
    var selector string
		var adr string
    
		fmt.Println("TCP socket test. input 1")
		fmt.Println("other -> exit")
		fmt.Scanln(&selector)

		if selector == "1" {
      fmt.Print("Input Ip & port (ex 127.0.0.1:8080)=")
      fmt.Scanln(&adr)
      socketTest(adr)
    } else {
			fmt.Println("Bad Input message. exit.")
			fmt.Println("Bye~")
			break
    }
	}
}
