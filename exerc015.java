package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc015 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da área em metros quadrados: ");
		double areaMetrosQuadrados = scan.nextDouble();
		
		double litrosTinta = areaMetrosQuadrados/3;
		
		if (litrosTinta < 18) {
			System.out.println("O cliente levará 1 lata de 18 litros ao custo de R$ 80,00.");
		} else 
		       {
			
			   double qtdLatas = litrosTinta/18;
			   double valorLatas = qtdLatas * 80;
			   
			   System.out.println("O cliente levará " + qtdLatas + " latas ao custo de " + valorLatas + " reais");
			   
		}

	}

}
