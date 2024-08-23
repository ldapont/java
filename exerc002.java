package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc002 {

	public static void main(String[] args) {
		
		
			
			Scanner scan = new Scanner(System.in); 
			
			System.out.println("Digite o número da primeira parcela da soma: ");
			double parcela1 = scan.nextDouble();
			System.out.println("Digite o número da segunda parcela da soma: ");
			double parcela2 = scan.nextDouble();
			double soma = parcela1 + parcela2;
			System.out.println("A soma da primeira parcela com a segunda parcela é: " + soma);

		}
		
	}


