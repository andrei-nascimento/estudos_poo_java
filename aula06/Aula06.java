package aula06;

public class Aula06 {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.abrirMenu();
		c.play();
		c.maisVolume();
		c.abrirMenu();
		c.pause();
		c.desligar();
	}

}
