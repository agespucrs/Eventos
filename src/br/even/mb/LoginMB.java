package br.even.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.event.facade.UsuarioFacade;
import br.event.model.Usuario;

@RequestScoped
@ManagedBean 
public class LoginMB extends AbstractMB {
	@ManagedProperty(value = UsuarioMB.INJECTION_NAME)
	private UsuarioMB usuarioMB;

	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		UsuarioFacade usuarioFacade = new UsuarioFacade();

		Usuario usuario = usuarioFacade.isValidLogin(email, password);
		
		if(usuario != null){
			usuarioMB.setUsuario(usuario);
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
			request.getSession().setAttribute("user", usuario);
			return "/protected/index.xhtml";
		}

		displayErrorMessageToUser("Verifique seu e-mail/senha");
		
		return null;
	}

	public void setUsuarioMB(UsuarioMB usuarioMB) {
		this.usuarioMB = usuarioMB;
	}	
}