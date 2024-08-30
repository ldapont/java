package com.loiane.cursojava.aula29;

public class Carro5 {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel; 
	
	Carro5(){
		
		System.out.println("Classe Carro5 foi instanciada");
		numPassageiros = 4;
	}
	
	Carro5(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
		
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
