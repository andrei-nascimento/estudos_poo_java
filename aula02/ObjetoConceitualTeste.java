package aula02;

public class ObjetoConceitualTeste {

	public static void main(String[] args) {
	
		Aula aula1 = new Aula();
		
		aula1.disciplina = "Matemática";
		aula1.duracao = 50;
		aula1.inicio = "10:10";
		aula1.termino = "11:00";
		aula1.tema = "Funções de segundo grau";
		
		aula1.status();
		aula1.terminarAula();
		
		
		Aula aula2 = new Aula();
		aula2.disciplina = "Geografia";
		aula2.duracao = 50;
		aula2.inicio = "11:00";
		aula2.termino = "11:50";
		aula2.tema = "Serrado brasileiro";
		
		aula2.status();
	}

}
