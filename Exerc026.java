package com.loiane.cursojava.exercicios;
import java.util.Scanner;


			public class Exerc026 {

				public static void main(String[] args) {
					
					Scanner scan = new Scanner(System.in);
					
					System.out.println("Digite o primeiro número: ");
					double num1 = scan.nextDouble();
					
					System.out.println("Digite o segundo número: ");
					double num2 = scan.nextDouble();
					
					System.out.println("Digite o terceiro número: ");
					double num3 = scan.nextDouble();
					
								
										
					if ((num1 > num2 && num1 > num3) && (num2 > num3)) {
						
						System.out.println("A ordem decrescente é: " + num1 + ", " + num2 + ", "+ num3);
						
					} else if ((num1 > num2 && num1 > num3) && (num2 < num3)) {
						
						System.out.println("A ordem decrescente é: " + num1 + ", " + num3 + ", " + num2);
						
					} 
					
				      else if ((num2 > num1 && num2 > num3) && (num1 > num3)) {
							
						System.out.println("A ordem decrescente é: " + num2 + ", " + num1 + ", " + num3);
							
					} else if ((num2 > num1 && num2 > num3) && (num1 < num3)) {
							
						System.out.println("A ordem decrescente é: " + num2 + ", " + num3 + ", " + num1);	
						
					}	
					
					else if ((num3 > num1 && num3 > num2) && (num1 > num2)) {
						
						System.out.println("A ordem decrescente é: " + num3 + ", " + num1 + ", " + num2);
							
					} else  {
							
						System.out.println("A ordem decrescente é: " + num3 + ", " + num2 + ", " +  num1);	
						
					}	
						
												
						
					
			
					
				
				}

			




	}


