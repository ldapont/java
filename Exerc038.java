package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Exerc038 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com o valor da posição " + i + "do vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		
        for (int i=0; i<vetorB.length; i++) {
			
			System.out.println("Entre com o valor da posição " + i + "do vetor B: ");
			vetorB[i] = scan.nextInt();
		
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        
        
                System.out.print("Vetor A: ");
                for (int i=0; i<vetorA.length; i++) {
			
			    System.out.print(vetorA[i] + " ");       
                } 

                System.out.println();
                
                System.out.print("Vetor B: ");
                for (int i=0; i<vetorB.length; i++) {
			
			    System.out.print(vetorB[i] + " ");       
                } 

                System.out.println();
                
                System.out.print("Vetor C: ");
                for (int i=0; i<vetorB.length; i++) {
			
			    System.out.print(vetorC[i] + " ");       
                } 

                System.out.println();
                
	}

}
