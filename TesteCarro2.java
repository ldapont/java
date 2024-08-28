package com.loiane.cursojava.aula25;

import com.loiane.cursojava.aula25.Carro2;

public class TesteCarro2 {

	public static void main(String[] args) {
		
		Carro2 van = new Carro2();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
        
		van.exibirAutonomia();
	}

}
