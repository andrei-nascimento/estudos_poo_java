package aula02;

public class Aula {

	int duracao;
	String disciplina;
	String inicio;
	String termino;
	String tema;
	
	void status() {
		System.out.println("\nA dura��o da aula � de: " + duracao + " minutos");
		System.out.println("A disciplina �: " + disciplina);
		System.out.println("A aula come�a �s: " + inicio);
		System.out.println("A aula termina �s: " + termino);
		System.out.println("O tema da aula �: " + tema);
	}
	
	void iniciarAula() {
	
	}
	
	void terminarAula() {
		if(this.duracao > 50) {
			System.out.println("J� est� na hora de encerrar a aula");
		} else {
			System.out.println("Aula em andamento, n�o � poss�vel encerrar");
		}
	}
	
	void cancelarAula() {
		
	}
	
	void corrigirExercicios() {

	}
}
