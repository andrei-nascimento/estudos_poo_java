package aula13;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() { //Sobreposição de Método
		System.out.println("Au Au Au!");
	}
	
	public void reagir(String frase) { //Sobrecarga de Método
		if(frase == "toma comida" || frase == "olá") {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) { //Sobrecarga de Método
		if(hora < 12) {
			System.out.println("Abanar");
		} else if(hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) { //Sobrecarga de Método
		if(dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
			this.emitirSom();
		}
	}
	
	public void reagir(int idade, float peso) { //Sobrecarga de Método
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if(peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
	
}
