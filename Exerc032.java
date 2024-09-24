package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Exerc032 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do lado A do triângulo: ");
		double ladoA = scan.nextDouble();
		
		System.out.println("Informe o valor do lado B do triângulo: ");
		double ladoB = scan.nextDouble();
		
		System.out.println("Informe o valor do lado C do triângulo: ");
		double ladoC = scan.nextDouble();
		
		if ((ladoA + ladoB) > ladoC || (ladoA + ladoC) > ladoB || (ladoB + ladoC) > ladoA) {
			
			if (ladoA == ladoB && ladoA == ladoC) {
				
				System.out.println("O triângulo é equilátero");
				
			} else 
				
			  if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
					
			  System.out.println("O triângulo é isósceles");	
		    } else 
				
			  if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
						
			  System.out.println("O triângulo é escaleno");	
		    }
			
			  else {
				  
				  System.out.println("A figura não é um triângulo.");
			  }
		

	}

}
	
}
