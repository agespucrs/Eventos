package br.event.model;

public class Noticias {
	private int idNoticia;
	private String titulo;
	private String texto;
	private long dtCadastro;
	private long dtAlteracao;
	private String status;
	public int getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public long getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(long dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public long getDtAlteracao() {
		return dtAlteracao;
	}
	public void setDtAlteracao(long dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
