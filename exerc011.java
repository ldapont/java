package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class exerc011 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a altura do homem: ");
		double alturaHomem = scan.nextDouble();
		
		System.out.println("Entre com a altura da mulher: ");
		double alturaMulher = scan.nextDouble();
		
		System.out.println("Entre com o peso do homem: ");
		double pesoHomem = scan.nextDouble();
		
		System.out.println("Entre com o peso da mulher: ");
		double pesoMulher = scan.nextDouble();
		
		double pesoIdealHomem = (72.7*alturaHomem) - 58;
		double pesoIdealMulher = (72.7*alturaMulher) - 58;
		
		System.out.println("O peso ideal para o homem é: " + pesoIdealHomem + " quilos");
		System.out.println("O peso ideal para a mulher é: " + pesoIdealMulher + " quilos");
		
		if (pesoHomem <= pesoIdealHomem) {
			System.out.println("O homem está com o peso ideal.");
		} else {
			System.out.println("O homem não está com o peso ideal.");
		}
		
		if (pesoMulher <= pesoIdealMulher) {
			System.out.println("A mulher está com o peso ideal.");
		} else {
			System.out.println("A mulher não está com o peso ideal.");
		}
		

	}

}
