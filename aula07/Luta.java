package aula07;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar( ) {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //Gera tr�s resultados aleat�rios
			
			System.out.println("===== RESULTADO DA LUTA =====");
			switch(vencedor) {
			case 0: //Empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta(); //Ambos aumentam n�mero de empates no hist�rico
				this.desafiante.empatarLuta();
				break;
			case 1: //Ganhou desafiado
				System.out.println("O desafiado " + this.desafiado.getNome() + " venceu!!!");
				this.desafiado.ganharLuta(); //Desafiado soma uma vit�ria no seu hist�rico
				this.desafiante.perderLuta(); //Desafiante soma uma derrota no seu hist�rico
				break;
			case 2: //Ganhou desafiante
				System.out.println("O desafiante " + this.desafiante.getNome() + " venceu!!!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break; 
			}
			System.out.println("=============================");
		} else {
			System.out.println("A luta n�o pode acontecer!");
		}
	}
}