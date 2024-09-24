package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exerc018 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		
		if (numero1 > numero2) {
			
			System.out.println("O maior número é: " + numero1);
		} else {
			
			System.out.println("O maior número é: " + numero2);
		}

	}

}
