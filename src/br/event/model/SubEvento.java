package br.event.model;

public class SubEvento {
	private int idSubEvento;
	private int idEvento;
	private String nome;
	private String sigla;
	private String descricao;
	private long dtInicio;
	private long dtFim;
	private long dtCadastro;
	private long dtAlteracao;
	public int getIdSubEvento() {
		return idSubEvento;
	}
	public void setIdSubEvento(int idSubEvento) {
		this.idSubEvento = idSubEvento;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(long dtInicio) {
		this.dtInicio = dtInicio;
	}
	public long getDtFim() {
		return dtFim;
	}
	public void setDtFim(long dtFim) {
		this.dtFim = dtFim;
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
}
