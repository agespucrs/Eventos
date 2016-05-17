package br.event.model;

import java.util.ArrayList;

public class Atividade {
  private int idAtividade;
  private int idLocal;
  private int idSubEvento;
  private String sigla;
  private String tipo;
  private String titulo;
  private String descricao;
  private long data;
  private long horaInicio;
  private long horaFim;
  private long dtCadastro;
  private long dtAlteracao;
  
  private ArrayList<Palestrante> palestrantes;
  
  public Atividade() {
		// TODO Auto-generated constructor stub
	}

public int getIdAtividade() {
	return idAtividade;
}

public void setIdAtividade(int idAtividade) {
	this.idAtividade = idAtividade;
}

public int getIdLocal() {
	return idLocal;
}

public void setIdLocal(int idLocal) {
	this.idLocal = idLocal;
}

public int getIdSubEvento() {
	return idSubEvento;
}

public void setIdSubEvento(int idSubEvento) {
	this.idSubEvento = idSubEvento;
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


}
