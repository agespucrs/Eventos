package br.event.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.event.bo.AtividadeBO;
import br.event.model.Atividade;


/**
 * 
 * Classe responsável por conter os metodos REST de acesso ao webservice
 *
 * @author 
 * @since 
 * @version 
 */
@Path("/atividade")
public class AtividadeResource {

	/**
	 * 
	 * Método responsável por fazer chamada ao controller
	 *
	 * @return 
	 * @author 
	 * @since 
	 * @version 
	 * @throws
	 * @throws 
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public List<Atividade> listarTodos() throws ClassNotFoundException, SQLException{
		return new AtividadeBO().listarTodos();
	}
}
