package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc008 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
		double celsius = (5 * (farenheit - 32)/9);
		
		System.out.println("Valor da temperatura Farenheit em Celsius é: " + celsius + " graus Celsius");
		

	}

}
