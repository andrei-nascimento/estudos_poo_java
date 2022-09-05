package aula09;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor; //Agregrei o tipo da vari�vel com a classe "Pessoa" que criei
	
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String detalhes() {
		return "T�tulo do Livro: " + titulo + "\nAutor(a): "
				+ autor + "\nTotal de P�ginas: " + totalPaginas
				+ ", P�gina Atual: " + pagAtual + "\nAberto: "
				+ aberto + "\nLeitor: " + leitor.getNome()
				+ ", Idade: " + leitor.getIdade()
				+ ", Sexo: " + leitor.getSexo();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) { //Recebe par�metro p�gina
		if(p > this.totalPaginas) { //Verifico se n�o colocou pra folhear mais p�ginas que o livro possui
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}

	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
}
