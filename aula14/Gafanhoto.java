package aula14;

public class Gafanhoto extends Pessoa {

	private String login;
	private int totalAssistido;
	
	public Gafanhoto(String nome, int idade, String genero, String login) {
		super(nome, idade, genero); //Construtor chamando a superinstancia, no caso, Pessoa.
		this.login = login;
		this.totalAssistido = 0;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	public void viuMaisUm() {
		
	}

	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totalAssistido=" + totalAssistido + "]";
	}
	
	
}
