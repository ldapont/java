package com.loiane.cursojava.exercicios;

import java.util.Scanner; 

public class exerc006 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = lado * lado;
		double dobroarea = 2 * area;
		
		System.out.println("O valor do dobro da área do quadrado é: " + dobroarea);

	}

}
