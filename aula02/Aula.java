package aula02;

public class Aula {

	int duracao;
	String disciplina;
	String inicio;
	String termino;
	String tema;
	
	void status() {
		System.out.println("\nA duração da aula é de: " + duracao + " minutos");
		System.out.println("A disciplina é: " + disciplina);
		System.out.println("A aula começa às: " + inicio);
		System.out.println("A aula termina às: " + termino);
		System.out.println("O tema da aula é: " + tema);
	}
	
	void iniciarAula() {
	
	}
	
	void terminarAula() {
		if(this.duracao > 50) {
			System.out.println("Já está na hora de encerrar a aula");
		} else {
			System.out.println("Aula em andamento, não é possível encerrar");
		}
	}
	
	void cancelarAula() {
		
	}
	
	void corrigirExercicios() {

	}
}
