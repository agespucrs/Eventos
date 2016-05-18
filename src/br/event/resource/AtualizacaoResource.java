package br.event.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
* @author Cassio
* @since  18/05/2016
* @version 1.0
*/
@Path("/atualizacao")
public class AtualizacaoResource {

	/**
	 * http://localhost:8080/Event/faces/ws/atualizacao/isAtualiza/200
	 */
	@GET
	@Path("/isAtualiza/{nData}")
	@Produces("application/json")
	public String isAtualiza(@PathParam("nData") long numeroData) {
		String resultado = "erro";
		if (numeroData < 0) {
			resultado = "numer menor zero";
		} else {
			resultado = "MAIOR QUE ZERO";
		}
		return resultado;
	}

}
