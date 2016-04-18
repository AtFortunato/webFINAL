package model;

public class Evento {
	private String nome;
	private String local;

	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento(String nome, String local) {
		super();
		this.nome = nome;
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
