package com.loiane.cursojava.exercicios;
import java.util.Scanner;

	public class Exerc021 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite a letra: ");
			String letra = scan.next();
			
		
	
			
		switch(letra) {
		
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u": System.out.println("A letra é vogal."); break;
		default: System.out.println("A letra é consoante.");
		}

	}

}
