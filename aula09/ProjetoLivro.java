package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[2]; //Duas pessoas
		Livro[] l = new Livro[3]; // Tr�s livros
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");

		l[0] = new Livro("Crep�sculo", "Stephenie Meyer", 424, p[0]); //Pedro � o leitor
		l[1] = new Livro("A Arte da Guerra", "Sun Tzu", 83, p[1]); //Maria � a leitora
		l[2] = new Livro("Laranja Mec�nica", "Anthony Burgess", 162, p[0]); //Pedro tamb�m � o leitor
		
		l[0].abrir();
		l[0].folhear(100); //Folheia at� a p�gina 200
		l[0].avancarPag();
		System.out.println(l[0].detalhes()); 
		
		System.out.println(l[1].detalhes()); 
		
	}

}
