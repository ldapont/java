package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc009 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com o primeiro número inteiro: ");
	int numInteiro1 = scan.nextInt();
	
	System.out.println("Entre com o segundo número inteiro: ");
	double numInteiro2 = scan.nextDouble();
	
	System.out.println("Entre com o valor do número real: ");
	double numReal = scan.nextDouble();
	
	double resultado1 = (2 * numInteiro1) + (numInteiro2/2); 
	double resultado2 = (3 * numInteiro1) + numReal;
	double resultado3 = numReal * numReal * numReal;
	
	System.out.println("O resultado do duplo do primeiro inteiro somado com a metade do segundo inteiro é: " + resultado1);
	System.out.println("O resultado do triplo do primeiro inteiro somado com o número real é: " + resultado2);
	System.out.println("O resultado do número real ao cubo é: " + resultado3);
	}
    
}
