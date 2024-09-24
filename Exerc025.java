package com.loiane.cursojava.exercicios;
import java.util.Scanner;


			public class Exerc025 {

				public static void main(String[] args) {
					
					Scanner scan = new Scanner(System.in);
					
					System.out.println("Digite o preço do produto A: ");
					double precoA = scan.nextDouble();
					
					System.out.println("Digite o preço do produto B: ");
					double precoB = scan.nextDouble();
					
					System.out.println("Digite o preço do produto C: ");
					double precoC = scan.nextDouble();
					
								
									
				
					
	                if (precoA < precoB && precoA < precoC) {
						
						System.out.println("Você deve comprar o produto A");
						
					} else if (precoB < precoA && precoB < precoC) {
						
						System.out.println("Você deve comprar o produto B");
						
					} else {
						
						System.out.println("Você deve comprar o produto C");
					}
					
				
			
					
				
				}

			




	}



