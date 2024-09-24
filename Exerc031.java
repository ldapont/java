package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Exerc031 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("Notas do aluno: " + nota1 + " e " + nota2);
		System.out.println("A média do aluno é: " + media); 
		
		if (media >=0 && media <=4) {
			
			String conceito = "E";
			System.out.println("A nota final do aluno é: " + conceito);
			System.out.println("O aluno está reprovado");
			
		} else if (media > 4 && media < 6) {
			
			String conceito = "D";
			System.out.println("A nota final do aluno é: " + conceito);
			System.out.println("O aluno está reprovado");
			
		} else  if (media >= 6 && media < 7.5) {
			
			String conceito = "C";
			System.out.println("A nota final do aluno é: " + conceito);
			System.out.println("O aluno está aprovado");
		
        } else  if (media >= 7.5 && media < 9) {
			
			String conceito = "B";
			System.out.println("A nota final do aluno é: " + conceito);
			System.out.println("O aluno está aprovado");
			
        } else  if (media >= 9) {
			
			String conceito = "A";
			System.out.println("A nota final do aluno é: " + conceito);
			System.out.println("O aluno está aprovado");	

	}
		
	}	

}
