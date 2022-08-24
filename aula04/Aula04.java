package aula04;

public class Aula04 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("NIC", 0.4F, "Amarela", true);
		c1.status();
		
		Caneta c2 = new Caneta("KKK", 1.5F, "Laranja", true);
		c2.status();
		
		/*c1.setModelo("BIC");
		//c1.modelo = ("BIC"); //Não irá funcionar pois o atributo está como private na classe Caneta
		
		c1.setPonta(0.5F);
		//c1.ponta = (0.5F); //Não irá funcionar pois o atributo está como private na classe Caneta
		
		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
		//c1.status();*/
		
	}

}
