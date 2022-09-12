package aula14;

public abstract class Pessoa { //Classe abstratra não pode virar objeto

	protected String nome;
	protected int idade;
	protected String genero;
	protected float experiencia;
	
	public Pessoa(String nome, int idade, String genero) { //Seleciono no construtor qual atributos quero setar/pré-configurar
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.experiencia = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float isExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}

	protected void ganharExp() {
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", experiencia=" + experiencia + "]";
	}
	
}
