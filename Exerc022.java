package com.loiane.cursojava.exercicios;
import java.util.Scanner;

	public class Exerc022 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota do aluno: ");
			double nota1 = scan.nextDouble();
			
			System.out.println("Digite a segunda nota do aluno: ");
			double nota2 = scan.nextDouble();
			
			double media = (nota1 + nota2)/2;
			
			if (media >= 7 && media <= 9) {
				
				System.out.println("O aluno está aprovado!");
				
			} else if (media == 10) {
				
				System.out.println("O aluno está aprovado com distinção!");
				
			} else {
				
				System.out.println("O aluno está reprovado!");
			}
		
	
			
		
		}

	}


