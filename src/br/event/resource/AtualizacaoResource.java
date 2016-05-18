package br.event.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/*
* @author 
* @since 
* @version 
*/
@Path("/atualizacao")
public class AtualizacaoResource {

	@GET
	@Path("/isAtualiza")
	@Produces("application/json")
	public String isAtualiza(long numeroData) {
		String resultado = "erro";
		if (numeroData < 0) {
			resultado = "numer menor zero";
		} else {
			resultado = "MAIOR QUE ZERO";
		}
		return resultado;
	}

}
