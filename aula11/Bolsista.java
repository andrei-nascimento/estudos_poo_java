package aula11;

public class Bolsista extends Aluno {

	private float bolsa;
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		 System.out.println("Renovando bolsa de " + this.nome);
	}
	
	@Override //Pagar mensalidade para um aluno � diferente para um bolsista, por isso fazemos a sobreposi��o do m�todo
	public void pagarMensalidade() {
		System.out.println(this.nome + " � bolsista! Pagamento facilitado");
	}
	
}
