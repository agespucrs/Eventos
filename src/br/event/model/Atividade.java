package br.event.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Atividade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ATIVIDADE")
	private int idAtividade;
	@OneToOne
	@JoinColumn(name="ID_LOCAL")
	private Local local;
	@OneToOne
	@JoinColumn(name="ID_SUB_EVENTO")
	private SubEvento subEvento;
	private String sigla;
	private String tipo;
	private String titulo;
	private String descricao;
	private long data;
	@Column(name="HORA_INICIO")
	private long horaInicio;
	@Column(name="HORA_FIM")
	private long horaFim;
	@Column(name="DT_CADASTRO")
	private long dtCadastro;
	@Column(name="DT_ALTERACAO")
	private long dtAlteracao;
	@OneToMany
	private ArrayList<Palestrante> palestrantes;

	public Atividade() {

	}

	public int getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}


	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public SubEvento getSubEvento() {
		return subEvento;
	}

	public void setSubEvento(SubEvento subEvento) {
		this.subEvento = subEvento;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public long getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(long horaInicio) {
		this.horaInicio = horaInicio;
	}

	public long getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(long horaFim) {
		this.horaFim = horaFim;
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

	public ArrayList<Palestrante> getPalestrantes() {
		return palestrantes;
	}

	public void setPalestrantes(ArrayList<Palestrante> palestrantes) {
		this.palestrantes = palestrantes;
	}

	@Override
	public String toString() {
		return "Atividade [idAtividade=" + idAtividade + ", local=" + local + ", subEvento=" + subEvento + ", sigla=" + sigla + ", tipo=" + tipo + ", titulo=" + titulo + ", descricao=" + descricao
				+ ", data=" + data + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", dtCadastro=" + dtCadastro + ", dtAlteracao=" + dtAlteracao + ", palestrantes=" + palestrantes + "]";
	}


}
