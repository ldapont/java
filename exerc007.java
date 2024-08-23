package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da sua hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com a quantidade de horas que você trabalhou neste mês: ");
		double horasTrabalhadas = scan.nextDouble();
		double valorAReceber = valorHora * horasTrabalhadas;
		
		System.out.println("Seu salário neste mês será de: " + valorAReceber + " reais."); 

	}

}
