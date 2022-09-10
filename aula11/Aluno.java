package aula11;

//public final class Aluno extends Pessoa { //Usando o final eu não permito que a classe Aluno tenha filhos
public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	//public final void pagarMensalidade() { //Usando o final, o método não pode ser sobreposto em suas filhas
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de Alune " + this.nome);
	}
	
}
