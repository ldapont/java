package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a medida em metros: ");
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		System.out.println("O valor " + metros + " metros tem " + centimetros + " centímetros"); 

	}

}
