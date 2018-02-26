package com.placeworkers;

import java.util.Scanner;

import com.placeworkers.tools.FibonacciRekursiv;

public class Main extends FibonacciRekursiv {

	public static void main(String[] args) throws Exception {

		System.out.println("Zahl eingeben:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = berechne(n);
		System.out.println("Fib " + n + " = " + result);
	}
}
