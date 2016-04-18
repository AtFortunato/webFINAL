package manegeBean;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.ConvidadoDAO;

import model.Convidado;
import model.Evento;

@ManagedBean
public class ConvidadoBean {
	private Convidado convidado = new Convidado();
	private ConvidadoDAO convidadoDAO = new ConvidadoDAO();
	private List<Convidado> convidados = new ArrayList();
	private Evento evento = new Evento();
	private boolean x = false;
	

	public ConvidadoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConvidadoBean(Convidado convidado, ConvidadoDAO convidadoDAO, List<Convidado> convidados, boolean x) {
		super();
		this.convidado = convidado;
		this.convidadoDAO = convidadoDAO;
		this.convidados = convidados;
		this.x = x;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	public ConvidadoDAO getConvidadoDAO() {
		return convidadoDAO;
	}

	public void setConvidadoDAO(ConvidadoDAO convidadoDAO) {
		this.convidadoDAO = convidadoDAO;
	}

	public List<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}

	public boolean isX() {
		return x;
	}

	public void setX(boolean x) {
		this.x = x;
	}

	public String cadastrarConvidado() throws ClassNotFoundException, SQLException {
		boolean z = convidadoDAO.cadastrarConvidado(convidado);
		System.out.println(z);
		if (z == true) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Convidado já existe!", "Convidado já existe!"));
			return "false";
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Convidado cadastrado!", "Convidado cadastrado!"));
			return "/convite.xhtml";
		}
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String passarTela(){
		return "/evento.xhtml";
	}
	
	public String telaCadastro(){
		return "/funcoes.xhtml";
	}
	
	public String telaListar(){
		return "/listar.xhtml";
	}
	
	public void verificarAcesso() throws ClassNotFoundException{
		boolean x = convidadoDAO.verificarAcesso(convidado.getCodigo());
		if(x==true){
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Codigo de acesso existente!", "Codigo de acesso existente!"));
		}else{
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Codigo de acesso inválido!", "Codigo de acesso inválido!"));
		}
	}
	public List<Convidado> getLista() throws ClassNotFoundException{
		this.convidados = convidadoDAO.listarConvidados(convidado.getNome(), x);
		if(x==false){
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nome não encontrado!", "Nome não encontrado!"));
		}
		return convidados;

	}


}
