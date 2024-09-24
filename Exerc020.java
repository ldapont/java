package com.loiane.cursojava.exercicios;
import java.util.Scanner;

	public class Exerc020 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o sexo: ");
			String sexo = scan.next();
			
		
	
			
		switch(sexo) {
		
		case "M": System.out.println("Sexo Masculino"); break;
		case "F": System.out.println("Sexo Feminino"); break;
		default: System.out.println("Sexo Inválido");
		}

	}

}
