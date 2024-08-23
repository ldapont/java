package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc005 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio do círculo: ");
		double raio = scan.nextDouble();
		double area = 3.14 * raio * raio;
		double area2 = raio * raio;
		
		System.out.println("O valor da área do círculo é: " + area + " ou " + area2 + " pi");

	}

}
