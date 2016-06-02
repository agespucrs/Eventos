package br.event.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AtividadeDTO {

	private int idAtividade;
	private int  local;
	private int subEvento;
	private String sigla;
	private String tipo;
	private String titulo;
	private String descricao;
	private long data;
	private long horaInicio;
	private long horaFim;
	private long dtCadastro;
	private long dtAlteracao;
	
	public AtividadeDTO() {}
	
	
	public AtividadeDTO(int idAtividade, int local, int subEvento, String sigla, String tipo, String titulo, String descricao,
			long data, long horaInicio, long horaFim, long dtCadastro,
			long dtAlteracao) {
		super();
		this.idAtividade = idAtividade;
		this.local = local;
		this.subEvento = subEvento;
		this.sigla = sigla;
		this.tipo = tipo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.dtCadastro = dtCadastro;
		this.dtAlteracao = dtAlteracao;
	}


	public int getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int local) {
		this.local = local;
	}
	public int getSubEvento() {
		return subEvento;
	}
	public void setSubEvento(int subEvento) {
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
	
	
}
