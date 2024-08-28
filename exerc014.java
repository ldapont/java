package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora trabalhada: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com o número de horas trabalhadas: ");
		double qteHora = scan.nextDouble();
		
		double salarioBruto = valorHora * qteHora;
		double ir = salarioBruto * 0.11; 
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		
		double salarioLiquido = salarioBruto - ir - inss - sindicato;
		
		System.out.println("O salário bruto é: " + salarioBruto);
		System.out.println("O desconto de IR é: " + ir);
		System.out.println("O desconto de INSS é: " + inss);
		System.out.println("O desconto do sindicato é: " + sindicato);
		System.out.println("O salário líquido é: " + salarioLiquido);
		
		

	}

}
