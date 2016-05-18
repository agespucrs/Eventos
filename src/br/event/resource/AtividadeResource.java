package br.event.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.event.bo.AtividadeController;
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
	 * @return ArrayList<Cliente> 
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:07:08
	 * @version 1.0
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Atividade> listarTodos() throws ClassNotFoundException, SQLException{
		return new AtividadeController().listarTodos();
	}
}
