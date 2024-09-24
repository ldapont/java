package com.loiane.cursojava.exercicios;
import java.util.Scanner;


			public class Exerc024 {

				public static void main(String[] args) {
					
					Scanner scan = new Scanner(System.in);
					
					System.out.println("Digite o primeiro número: ");
					double num1 = scan.nextDouble();
					
					System.out.println("Digite o segundo número: ");
					double num2 = scan.nextDouble();
					
					System.out.println("Digite o terceiro número: ");
					double num3 = scan.nextDouble();
					
								
										
					if (num1 > num2 && num1 > num3) {
						
						System.out.println("O maior número é: " + num1);
						
					} else if (num2 > num1 && num2 > num3) {
						
						System.out.println("O maior número é: " + num2);
						
					} else {
						
						System.out.println("O maior número é: " + num3);
					}
					
	                if (num1 < num2 && num1 < num3) {
						
						System.out.println("O menor número é: " + num1);
						
					} else if (num2 < num1 && num2 < num3) {
						
						System.out.println("O menor número é: " + num2);
						
					} else {
						
						System.out.println("O menor número é: " + num3);
					}
					
				
			
					
				
				}

			




	}


