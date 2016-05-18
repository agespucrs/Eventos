package br.event.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Palestrante {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PALESTRANTE")
	private int idPalestrante;
	private String nome;
	private String email;
	@Column(name="DT_CADASTRO")
	private long dtCadastro;
	@Column(name="DT_ALTERACAO")
	private long dtAlteracao;
	
	public int getIdPalestrante() {
		return idPalestrante;
	}

	public void setIdPalestrante(int idPalestrante) {
		this.idPalestrante = idPalestrante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	}

	private ArrayList<Atividade> atividades;
}
