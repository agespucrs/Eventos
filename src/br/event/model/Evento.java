package br.event.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TB_EVENTO")
public class Evento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_EVENTO")
	private int idEvento;
	private String nome;
	private String sigla;
	private String descricao;
	@Column(name="DT_INICIO")
	private long dtInicio;
	@Column(name="DT_FIM")
	private long dtFim;
	@Column(name="DT_CADASTRO")
	private long dtCadastro;
	@Column(name="DT_ALTERACAO")
	private long dtAlteracao;
	
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
