package br.event.model;

public class Atualizacao {
	private int idAtualizacao;
	private long dtUltimaAtualizacao;
	private int QtdRegistrosAtualizados;
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
