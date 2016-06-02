package br.event.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.event.dto.AtividadeDTO;
import br.event.model.Atividade;

/**
 * @author Cassio 
 * @since 31/05/2016
 * @version 1.0
 */
public class AtividadeDAO extends GenericDAO<Atividade> implements Serializable  {


	private static final long serialVersionUID = 8422939125107375085L;
	
	
	/**
	 * 
	 * Método responsável por criar uma instancia da classe ClienteDAO (Singleton)
	 *
	 * @return
	 * @author 
	 * @since 
	 * @version 1.0
	 */
	public  AtividadeDAO(){
		super(Atividade.class);
	}

	
	/**
	 *
	 * @author Cassio 
	 * @since 31/05/2016
	 * @version 1.0
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public List<AtividadeDTO> listarTodos(Long dataAtualizacao) {
		
		 Map<String, Object> parameters = new HashMap<String, Object>();
		 parameters.put("dataAtualizacao", dataAtualizacao);
		 return (List<AtividadeDTO>) super.findAnyResult(Atividade.LISTA_ATIVIDADES, parameters);
		 
	}
		
	
}
