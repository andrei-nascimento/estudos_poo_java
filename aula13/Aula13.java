package aula13;

public class Aula13 {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		c.reagir("olá");
		c.reagir(false);

		c.reagir(11, 45);
		c.reagir(19, 00);
		
		c.reagir(2, 12.5F);
		c.reagir(17, 4.5F);
	}

}
