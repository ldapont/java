package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Exerc028 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do salário: ");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			
			double novoSalario = salario + salario * 0.2;
			
			System.out.println("O novo salário é: " + novoSalario);
			System.out.println("O percentual de aumento foi de 20%");
			
		} else if (salario > 280 && salario <= 700) {
			
			       double novoSalario = salario + salario * 0.15;
			
			       System.out.println("O novo salário é: " + novoSalario);
			       System.out.println("O percentual de aumento foi de 15%");
			
		} else if (salario > 700 && salario <= 1500) {
			
		       double novoSalario = salario + salario * 0.10;
		
		       System.out.println("O novo salário é: " + novoSalario);
		       System.out.println("O percentual de aumento foi de 10%");
		
	}     else  {
		
	       double novoSalario = salario + salario * 0.05;
	
	       System.out.println("O novo salário é: " + novoSalario);
	       System.out.println("O percentual de aumento foi de 5%");
	
} 
		
	
	}

}
