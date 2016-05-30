package br.event.resource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.event.bo.NoticiaBO;
import br.event.model.Noticia;


/**
 * Classe responsável por conter os metodos REST de acesso ao webservice
 * @author Cassio
 * @since  20/05/2016
 * @version 1.0
 * /Event/public/ws/noticias/listarTodas/ATIVO
 */

@Path("/noticias")
public class NoticiaResource {
	@GET
	@Path("/listarTodas/{pStatus}")
	@Produces("application/json")
	public List<Noticia> listarTodas(@PathParam("pStatus") String status) throws ClassNotFoundException, SQLException{
		
		NoticiaBO bo = new NoticiaBO();
		ArrayList<Noticia> noticias = (ArrayList<Noticia>) bo.listarTodas(status);
		
		return noticias;
	}
}
