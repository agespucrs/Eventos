package br.event.model;

public class Local {
	private int idLocal;
	private String predio;
	private String tipo;
	private int qntLugares;
	private String local;
	private long dtCadastro;
	private long dtAlteracao;
	public int getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	public String getPredio() {
		return predio;
	}
	public void setPredio(String predio) {
		this.predio = predio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQntLugares() {
		return qntLugares;
	}
	public void setQntLugares(int qntLugares) {
		this.qntLugares = qntLugares;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
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
