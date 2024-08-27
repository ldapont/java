package com.loiane.cursojava.exercicios;

import java.util.Scanner;



public class exerc010 {
	
	public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("Entre com o valor da altura da pessoa: ");
	double altura = scan.nextDouble();
	
	double pesoIdeal = (72.7*altura) - 58;
	
	System.out.println("O peso ideal dessa pessoa é: " + pesoIdeal + " quilos");
	
	

}
}

