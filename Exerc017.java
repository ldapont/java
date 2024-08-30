package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exerc017 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo em megabytes(MB): ");
		double tamMegabytes = scan.nextDouble();
		
		System.out.println("Entre com a velocidade de download em megabits(Mbps): ");
		double velMegabits = scan.nextDouble();
		
		double velDownload = velMegabits * 0.125;
		double tempoDownloadSegundos = tamMegabytes/velDownload;
		double tempoDownloadMinutos = tempoDownloadSegundos / 60;
		
		System.out.println("O download do arquivo levará " + tempoDownloadMinutos + " minutos");
		
		
		
		

	}

}
