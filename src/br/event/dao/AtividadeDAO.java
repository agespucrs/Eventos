package br.event.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.event.model.Atividade;
import br.event.model.SubEvento;
import br.event.util.JpaUtil;

/**
 * 
 * Classe responsável por conter os metodos do CRUD
 *
<<<<<<< HEAD
 * @author 
 * @since 
 * @version 1.0
 */
public class AtividadeDAO extends GenericDAO {

	private static AtividadeDAO atividadeDAO;
	private List<Atividade> atividades;
	static EntityManager fabrica = JpaUtil.getFactory();
	
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
		super(AtividadeDAO.class);
	}

	
	/**
	 * 
	 * Método responsável por listar todos os clientes do banco
	 *
	 * @return 
	 * @author  
	 * @since 
	 * @version 1.0
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Atividade> listarTodos(Long dataAtualizacao) throws ClassNotFoundException, SQLException{
		
		 Map<String, Object> parameters = new HashMap<String, Object>();
		 parameters.put("dataAtualizacao", dataAtualizacao);
		 return (List<Atividade>) super.findAnyResult(Atividade.LISTA_ATIVIDADES, parameters);
		 
	}
		
	
}
