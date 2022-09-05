package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[2]; //Duas pessoas
		Livro[] l = new Livro[3]; // Três livros
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");

		l[0] = new Livro("Crepúsculo", "Stephenie Meyer", 424, p[0]); //Pedro é o leitor
		l[1] = new Livro("A Arte da Guerra", "Sun Tzu", 83, p[1]); //Maria é a leitora
		l[2] = new Livro("Laranja Mecânica", "Anthony Burgess", 162, p[0]); //Pedro também é o leitor
		
		l[0].abrir();
		l[0].folhear(100); //Folheia até a página 200
		l[0].avancarPag();
		System.out.println(l[0].detalhes()); 
		
		System.out.println(l[1].detalhes()); 
		
	}

}
