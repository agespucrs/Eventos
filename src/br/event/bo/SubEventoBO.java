package br.event.bo;

import java.util.List;

import br.event.dao.SubEventoDAO;
import br.event.model.SubEvento;

public class SubEventoBO {

	private SubEventoDAO dao = new SubEventoDAO();
	
	public List<SubEvento> listar(Long dataAtualizacao) {
		System.out.println("Gerando Lista SubEventos para atualizacao");
		dao.beginTransaction();
		List<SubEvento> subeventos = dao.listar(dataAtualizacao);
		
		return subeventos;
	}

}
