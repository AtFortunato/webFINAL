package model;

public class Convidado extends Pessoa {
	private int codigo;
	private String perfil;// tipo de convite especial ou pagante

	public Convidado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Convidado(String nome, Endereco endereco, int cpf, int rg) {
		super(nome, endereco, cpf, rg);
		// TODO Auto-generated constructor stub
	}

	public Convidado(int codigo, String perfil) {
		super();
		this.codigo = codigo;
		this.perfil = perfil;
	}

	public Convidado(String nome, Endereco endereco, int cpf, int rg, int codigo, String perfil) {
		super(nome, endereco, cpf, rg);
		this.codigo = codigo;
		this.perfil = perfil;
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
