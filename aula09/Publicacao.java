package aula09;

public interface Publicacao {

	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhear(int p); //par�metro "p�gina"
	public abstract void avancarPag();
	public abstract void voltarPag();
	
}
