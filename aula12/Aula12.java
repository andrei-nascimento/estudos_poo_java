package aula12;

public class Aula12 {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru can = new Canguru();
		Cachorro ca = new Cachorro();
		Cobra co = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara ara = new Arara();
		
		/*
		m.setPeso(46.2F);
		m.setCorPelo("Cinza");
		m.alimentar(); //Mamando
		m.locomover(); //Correndo
		m.emitirSom(); //Som de Mam�fero
		*/
		
		/*
		a.locomover(); //Voando
		p.locomover(); //Nadando
		r.locomover(); //Rastejando
		*/
		
		can.locomover(); //Saltando
		can.emitirSom(); //Som de Mam�fero
		ca.locomover(); //Correndo
		ca.emitirSom(); //Au Au Au
	}

}
