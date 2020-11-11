package main

import (
	"fmt"
)

func main() {
	var a, b int
	fmt.Scan(&a)
	fmt.Scan(&b)
	if a % b == 0 || b % a == 0 {
		fmt.Printf("Sao Multiplos\n")
	} else {
		fmt.Printf("Nao sao Multiplos\n")
	}
}
