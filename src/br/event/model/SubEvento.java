package br.event.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="TB_SUB_EVENTO")
@NamedQueries({
	@NamedQuery(name = "SubEvento.ListAll", query = "SELECT s FROM SubEvento s where s.dtAlteracao >= :dataAtualizacao")
}) 
public class SubEvento implements Serializable{

	private static final long serialVersionUID = -1160756620220411798L;
	public static final String LISTA_SUBEVENTOS = "SubEvento.ListAll";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SUB_EVENTO")
  private int idSubEvento;
	@ManyToOne
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;
	private String nome;
	private String sigla;
	private String descricao;
	private long dtInicio;
	private long dtFim;
	@Column(name="DT_CADASTRO")
	private long dtCadastro;
	@Column(name="DT_ALTERACAO")
	private long dtAlteracao;
	public int getIdSubEvento() {
		return idSubEvento;
	}
	public void setIdSubEvento(int idSubEvento) {
		this.idSubEvento = idSubEvento;
	}
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
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
