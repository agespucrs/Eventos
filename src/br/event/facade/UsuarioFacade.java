package br.event.facade;

import br.event.dao.UsuarioDAO;
import br.event.model.Usuario;;

public class UsuarioFacade {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	public Usuario isValidLogin(String email, String password) {
		usuarioDAO.beginTransaction();
		Usuario usuario = usuarioDAO.findUserByEmail(email);

		if (usuario == null || !usuario.getSenha().equals(password)) {
			return null;
		}

		return usuario;
	}
}