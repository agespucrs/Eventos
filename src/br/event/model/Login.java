package br.event.model;

/**
 * Clase para DTO para validar o usuario 
 * @author cassio
 * @since 18/05/2016
 * @version 1.0
 *
 */
public class Login {
	private int idlogin;
	private String usuario;
	private String senha;
	public int getIdlogin() {
		return idlogin;
	}
	public void setIdlogin(int idlogin) {
		this.idlogin = idlogin;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
