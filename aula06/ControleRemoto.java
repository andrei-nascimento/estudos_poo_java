package aula06;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		System.out.println("Sistema iniciado com sucesso");
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		System.out.println("Desligando o sistema...");
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("------MENU------");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.println("Volume: " + this.getVolume());
			for(int i = 0; i < this.getVolume(); i += 10) {
				System.out.print("|");
			}
		} else {
			System.out.println("\nImpossível abrir o menu com a televisão desligada");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("\nFechando menu...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("\nImpossível aumentar o volume");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("\nImpossível diminuir o volume");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("O sistema já está mudo");
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		} else {
			System.out.println("\nO mudo já está desativado");
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
			System.out.println("\nExibindo programa na tela...");
		} else {
			System.out.println("\nNão consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && (this.getTocando())) {
			this.setTocando(false);
			System.out.println("\nPrograma pausado...");
		} else {
			System.out.println("\nNão consegui pausar");
		}
	}
	
	
}
