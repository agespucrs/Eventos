package br.event.dao;
 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.event.model.Noticia;
import br.event.model.Usuario;
 
public class UsuarioDAO extends GenericDAO<Usuario> {
 
	private static final long serialVersionUID = 1L;

	public UsuarioDAO() {
        super(Usuario.class);
    }
 
    public Usuario findUserByEmail(String email){
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("email", email);     
 
        return super.findOneResult(Usuario.FIND_BY_EMAIL, parameters);
    }
}