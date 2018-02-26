package com.placeworkers.tools;

public class FibonacciRekursiv {
	// Rekursive Berechnung der Fibonaccizahl
	public static int berechne(int i) {
		if (i < 2) // fuer negative Zahl auch 0!
			return 1;
		else
			return berechne(i - 1) + berechne(i - 2);

	}
}
// FibonacciZahlen.
//
// Fibonacci ist definiert als eine Funktion mit natürlichen Zahlen, die wie
// folgt definiert ist:
//
// F(n) = F(n-1)+F(n-2)
//
// Wobei
//
// F(1) = 1
// F(2) = 1
