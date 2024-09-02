package com.loiane.cursojava.aula30;

public class Carro6 {
  
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel; 
	
	
	
	
	
	public Carro6(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
	
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro6() {
		
	}
	
	

	public Carro6(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros.");
		
		
	}

	public Carro6(String marca, String modelo) {
		
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros.");
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

    double obterAutonomia() {
    	
    	System.out.println("Método obterAutonomia foi chamado");
    	
    	return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km) { 
    	
    	double qtdCombustivel = km/consumoCombustivel;
    	
    	return qtdCombustivel;
}
}
