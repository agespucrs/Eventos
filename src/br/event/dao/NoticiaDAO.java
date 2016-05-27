package br.event.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.event.model.Noticia;

/**
 * @author Cassio 
 * @since 20/05/2016
 * @version 1.0
 */
public class NoticiaDAO extends GenericDAO<Noticia> {

	private static final long serialVersionUID = 3730050864028553186L;
	private static NoticiaDAO noticiaDAO;
	public NoticiaDAO() {
		super(Noticia.class);
	}

	public static NoticiaDAO getInstance(){
		if(noticiaDAO == null)
			noticiaDAO = new NoticiaDAO();
		return noticiaDAO;
	}

	
	/**
	 * Método responsável por listar todas as Noticias ativas 
	 *
	 * @author Cassio 
	 * @since 20/05/2016
	 * @version 1.0
	 */
	@SuppressWarnings("unchecked")
	public List<Noticia> listarTodas(String status) throws ClassNotFoundException, SQLException{
		
		 Map<String, Object> parameters = new HashMap<String, Object>();
     parameters.put("status", status);     

     return (List<Noticia>) super.findAnyResult(Noticia.LISTA_NOTICIAS_ATIVAS, parameters);
		
	}

  
	public List<Noticia> listAll() {
		noticiaDAO.beginTransaction();
		List<Noticia> result = noticiaDAO.findAll();
		noticiaDAO.closeTransaction();
		return result;
	}

}
