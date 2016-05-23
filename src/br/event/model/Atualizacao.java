package br.event.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="TB_ATUALIZACAO")
public class Atualizacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ATUALIZACAO")
	private int idAtualizacao;
	@Column(name="DT_ULTIMA_ATUALIZACAO")
	private long dtUltimaAtualizacao;
	@Column(name="QTD_REGISTROS_ATUALIZADOS")
	private int QtdRegistrosAtualizados;
	
	public Atualizacao() {}
	
	public int getIdAtualizacao() {
		return idAtualizacao;
	}
	public void setIdAtualizacao(int idAtualizacao) {
		this.idAtualizacao = idAtualizacao;
	}
	public long getDtUltimaAtualizacao() {
		return dtUltimaAtualizacao;
	}
	public void setDtUltimaAtualizacao(long dtUltimaAtualizacao) {
		this.dtUltimaAtualizacao = dtUltimaAtualizacao;
	}
	public int getQtdRegistrosAtualizados() {
		return QtdRegistrosAtualizados;
	}
	public void setQtdRegistrosAtualizados(int qtdRegistrosAtualizados) {
		QtdRegistrosAtualizados = qtdRegistrosAtualizados;
	}
}
