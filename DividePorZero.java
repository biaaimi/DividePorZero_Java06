package br.com.erros;

import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Número: ");
		
		int a = s.nextInt();
		System.out.println("Divisor: ");
		
		int b = s.nextInt();
		System.out.println(a/b);
		

	}

}
