package br.even.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.event.model.Usuario;

@SessionScoped
@ManagedBean(name="usuarioMB")
public class UsuarioMB implements Serializable {
	public static final String INJECTION_NAME = "#{usuarioMB}";
	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	public boolean isAdmin() {
		return usuario.isAdmin();
	}

	public boolean isDefaultUser() {
		return usuario.isUser();
	}

	public String logOut() {
		getRequest().getSession().invalidate();
		return "/public/login.xhtml";
	}

	private HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}