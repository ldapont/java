package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc013 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do peso do peixe: ");
		double pesoPeixe = scan.nextDouble();
		
		int pesoMaximo = 50;
		int valorMulta = 40; 
		double excesso = pesoPeixe - 50;
		double multaPagar = excesso * 4;
		
		if (pesoPeixe > pesoMaximo ) {
			System.out.println("João deverá pagar " + multaPagar + " reais de multa.");
		} else {
			excesso = 0;
			multaPagar = 0;
			
			System.out.println("Os valores do excesso de peso e da multa a pagar são: " + excesso + multaPagar);
		}

	}

}
