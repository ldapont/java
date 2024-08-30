package com.loiane.cursojava.aula29;

import com.loiane.cursojava.aula24.Carro;

public class TesteCarro5 {

	public static void main(String[] args) {
		
		Carro5 van = new Carro5();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro5 van2 = new Carro5("Fiat", "Ducato", 10, 100, 0.2);
	
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);

		
		System.out.println(van.marca);
		System.out.println(van.modelo);

	}

}
