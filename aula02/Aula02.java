package aula02;

public class Aula02 {

	public static void main (String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul"; //REFER?NCIA ? ATRIBUTO
		c1.ponta = 0.5F;
		c1.tampar();
		c1.status(); //REFER?NCIA ? M?TODO
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
		
}
