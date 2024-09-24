package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Exerc027 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("Digite o turno que você estuda (M - matutino, V - vespertino, N - noturno" );
        
		String turno = scan.next();
        
        switch(turno) {
        
        case "M": System.out.println("Bom dia"); break;
        case "V": System.out.println("Boa tarde"); break;
        case "N": System.out.println("Boa noite"); break;
        default: System.out.println("Valor Inválido");
        }
	}

}
