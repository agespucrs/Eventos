package br.event.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.event.bo.SubEventoBO;
import br.event.model.SubEvento;


/**
 * Classe responsável por conter os metodos REST de acesso ao webservice
 * @author Cassio
 * @since  20/05/2016
 * @version 1.0
 * /Event/ws/subevento/listar/{dataAtualizacao} long
 */

@Path("/subevento")
public class SubEventoResource {
	@GET
	@Path("/listar/{pData}")
	@Produces("application/json")
	public List<SubEvento> listar(@PathParam("pData") Long dataAtualizacao) throws ClassNotFoundException, SQLException{
		
		return new SubEventoBO().listar(dataAtualizacao);
	}
}
