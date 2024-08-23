package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc003 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("A nota do aluno A no 1o. bimestre é: ");
		double nota1 = scan.nextDouble();
		System.out.println("A nota do aluno A no 2o. bimestre é: ");
		double nota2 = scan.nextDouble();
		System.out.println("A nota do aluno A no 3o. bimestre é: ");
		double nota3 = scan.nextDouble();
		System.out.println("A nota do aluno A no 4o. bimestre é: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média final do aluno A no ano letivo é: " + media);

	}

}
