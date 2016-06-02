package br.event.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.event.bo.AtividadeBO;
import br.event.dto.AtividadeDTO;
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
	@Path("/listar/{pData}")
	@Produces("application/json")
	public List<AtividadeDTO> listar(@PathParam("pData") Long dataAtualizacao) throws ClassNotFoundException, SQLException{
		
		AtividadeBO bo = new AtividadeBO();
		List<AtividadeDTO> list = bo.listarTodos(dataAtualizacao);
		
		return list ;
	}
}
