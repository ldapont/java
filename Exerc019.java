package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exerc019 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = scan.nextDouble();
		
			
		if (numero1 >= 0) {
			
			System.out.println("Este número é positivo");
		} else {
			
			System.out.println("Este número é negativo");
		}

	}

}
