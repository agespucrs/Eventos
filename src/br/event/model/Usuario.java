package br.event.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * 
 * Classe responsável por conter os atributos do Objeto Cliente
 *
 * @author Cassio
 * @since 19/05/2016
 * @version 1.0
 */

@XmlRootElement
@Entity
@Table(name="TB_USUARIO")
@NamedQuery(name = "Usuario.findUserByEmail", query = "select u from Usuario u where u.email = :email")
public class Usuario implements Serializable{

	private static final long serialVersionUID = -6801911982836712464L;

	public static final String FIND_BY_EMAIL = "Usuario.findUserByEmail";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USUARIO")
	private Integer id;
	private String nome;
	private String login;
	private String email;
	private String senha;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public boolean isAdmin() {
		return Role.ADMIN.equals(role);
	}

	public boolean isUser() {
		return Role.USER.equals(role);
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario usuario = (Usuario) obj;
			return usuario.getId() == id;
		}

		return false;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", email=" + email + ", senha=" + senha + "]";
	}
	
	
}
