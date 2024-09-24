package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Exerc029 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de horas: ");
		double hora = scan.nextDouble();
		
		System.out.println("Entre com o valor da hora: ");
		double valorHora = scan.nextDouble();
		
		double valorSalario = hora * valorHora; 
		
		
		if (valorSalario <= 900) {
			
			double descontoSindicato = valorSalario * 0.03;
			double valorFGTS = valorSalario * 0.11;
			double salarioLiquido = valorSalario - descontoSindicato;
			
			System.out.println("Salário Bruto: R$ " + valorSalario);
			System.out.println("(-) IR 0%: 0,00 ");
			System.out.println("(-) 3% do sindicato: " + descontoSindicato);
			System.out.println("FGTS (11%): " + valorFGTS);
			System.out.println("Total de descontos: " + descontoSindicato);
			System.out.println("Salário Líquido: " + salarioLiquido);
			
			
			
		} else 
			
			if (valorSalario > 900 && valorSalario <= 1500) {
				
				double descontoSindicato = valorSalario * 0.03;
				double descontoImposto = valorSalario * 0.05; 
				double valorFGTS = valorSalario * 0.11;
				double totalDescontos = descontoSindicato + descontoImposto;
				double salarioLiquido = valorSalario - totalDescontos;
				
				System.out.println("Salário Bruto: R$ " + valorSalario);
				System.out.println("(-) IR: 5%: R$ " + descontoImposto);
				System.out.println("(-) 3% do sindicato: " + descontoSindicato);
				System.out.println("FGTS (11%): " + valorFGTS);
				System.out.println("Total de descontos: " + totalDescontos);
				System.out.println("Salário Líquido: " + salarioLiquido);	

		
	
	
        } else 
	
	            if (valorSalario > 900 && valorSalario <= 1500) {
		
		        double descontoSindicato = valorSalario * 0.03;
	         	double descontoImposto = valorSalario * 0.05; 
	        	double valorFGTS = valorSalario * 0.11;
	        	double totalDescontos = descontoSindicato + descontoImposto;
	        	double salarioLiquido = valorSalario - totalDescontos;
		
	        	System.out.println("Salário Bruto: R$ " + valorSalario);
	        	System.out.println("(-) IR: 5%: R$ " + descontoImposto);
	         	System.out.println("(-) 3% do sindicato: " + descontoSindicato);
	        	System.out.println("FGTS (11%): " + valorFGTS);
		        System.out.println("Total de descontos: " + totalDescontos);
		        System.out.println("Salário Líquido: " + salarioLiquido);	
} 
	            else 
	            	
		            if (valorSalario > 1500 && valorSalario <= 2500) {
			
			        double descontoSindicato = valorSalario * 0.03;
		         	double descontoImposto = valorSalario * 0.10; 
		        	double valorFGTS = valorSalario * 0.11;
		        	double totalDescontos = descontoSindicato + descontoImposto;
		        	double salarioLiquido = valorSalario - totalDescontos;
			
		        	System.out.println("Salário Bruto: R$ " + valorSalario);
		        	System.out.println("(-) IR: 10%: R$ " + descontoImposto);
		         	System.out.println("(-) 3% do sindicato: " + descontoSindicato);
		        	System.out.println("FGTS (11%): " + valorFGTS);
			        System.out.println("Total de descontos: " + totalDescontos);
			        System.out.println("Salário Líquido: " + salarioLiquido);	
	} 
		            else 
		            	
			            if (valorSalario > 2500) {
				
				        double descontoSindicato = valorSalario * 0.03;
			         	double descontoImposto = valorSalario * 0.20; 
			        	double valorFGTS = valorSalario * 0.11;
			        	double totalDescontos = descontoSindicato + descontoImposto;
			        	double salarioLiquido = valorSalario - totalDescontos;
				
			        	System.out.println("Salário Bruto: R$ " + valorSalario);
			        	System.out.println("(-) IR: 10%: R$ " + descontoImposto);
			         	System.out.println("(-) 3% do sindicato: " + descontoSindicato);
			        	System.out.println("FGTS (11%): " + valorFGTS);
				        System.out.println("Total de descontos: " + totalDescontos);
				        System.out.println("Salário Líquido: " + salarioLiquido);	
		} 

}

}

