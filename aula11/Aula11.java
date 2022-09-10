package aula11;

public class Aula11 {

	public static void main(String[] args) {
		
		/*
		Visitante v1 = new Visitante();
		v1.setNome("Andrei");
		v1.setIdade(23);
		v1.setGenero("Masculino");
		System.out.println(v1.toString());
		*/

		Aluno a1 = new Aluno();
		a1.setNome("Rita");
		a1.setIdade(27);
		a1.setGenero("Feminino");
		a1.setMatricula(123456);
		a1.setCurso("Marketing");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Letícia");
		b1.setIdade(30);
		b1.setGenero("Feminino");
		b1.setMatricula(123457);
		b1.setBolsa(15.5F);
		b1.pagarMensalidade();
		
	}

}
