package aula14;

public class Aula14 {

	public static void main(String[] args) {
		
		Video v[] = new Video[3]; 
		v[0] = new Video("Aula 1 de POO");  
		v[1] = new Video("Aula 2 de Java");
		v[2] = new Video("Aula 3 de PHP");
		//System.out.println(v[1].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Andrei", 23, "Masculino", "Andrei_Thrash");
		g[1] = new Gafanhoto("Rita", 27, "Feminino", "Kiota_Rita");
		//System.out.println(g[0].toString());
		
		Visualizacao vis[] = new Visualizacao[5]; 
		vis[0] = new Visualizacao(g[0], v[2]); //Andrei assiste PHP
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]); //Andrei assiste Java
		vis[0].avaliar(87.0F);
		System.out.println(vis[1].toString());
		
		/*
		System.out.println("\nVÍDEOS-----------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("\nGAFANHOTOS-------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		*/
	}

}
