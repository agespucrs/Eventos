package br.event.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.event.model.SubEvento;

/**
 * @author Cassio 
 * @since 203/05/2016
 * @version 1.0
 */

public class SubEventoDAO extends GenericDAO<SubEvento>{

	private static final long serialVersionUID = 8114381690720477026L;
	
	public SubEventoDAO() {
		super(SubEvento.class);
	}
	/**
	 * 
	 * Método responsável por listar todas as Noticias ativas 
	 *
	 * @author Cassio 
	 * @since 23/05/2016
	 * @version 1.0
	 */
	@SuppressWarnings("unchecked")
	public List<SubEvento> listar(Long dataAtualizacao) {
		
		 Map<String, Object> parameters = new HashMap<String, Object>();
		 parameters.put("dataAtualizacao", dataAtualizacao);
		 
		 return (List<SubEvento>) super.findAnyResult(SubEvento.LISTA_SUBEVENTOS, parameters);
		 
	}
}
