package com.loiane.cursojava.aula31;

public class Carro7 {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel; 
	
	
	
	
	
	public Carro7(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
	
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro7() {
		
	}
	
	

	public Carro7(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros.");
		
		
	}

	public Carro7(String marca, String modelo) {
		
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
    
    private double divideKMPorConsumoCombustivel(double km) {
    	
    	return km/this.consumoCombustivel;
    }
    
    double calcularCombustivel(double km) { 
    	
    	double qtdCombustivel = km/consumoCombustivel;
    	
    	return qtdCombustivel;

}
}