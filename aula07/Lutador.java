package aula07;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias,
			int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 55.5) {
			this.categoria = "Inválido - Você precisa de mais peso para lutar";
		} else if(this.peso <= 70.5) {
			this.categoria = "Leve";
		} else if(this.peso <= 82.5) {
			this.categoria = "Médio";
		} else if(this.peso <= 120.5) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido - Não existem categorias para seu peso";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	
	public void apresentar() {
		System.out.println("******CHEGOU O MOMENTO TÃO ESPERADO!!!******");
		System.out.println("Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " m de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " vitória(s)");
		System.out.println(this.getDerrotas() + " derrota(s)");
		System.out.println(this.getEmpates() + " empate(s)!");
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vez(es)");
		System.out.println("Perdeu " + this.getDerrotas() + " vez(es)");
		System.out.println("Empatou " + this.getEmpates() + " vez(es)");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
}
