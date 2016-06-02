package br.event.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.event.dao.AtividadeDAO;
import br.event.dto.AtividadeDTO;
import br.event.model.Atividade;

/**
 * 
 * Classe responsável por ser o controlador entre o resource e a camada DAO
 *

 * @author André Farias
 * @since 17/05/2016
 * @version 1.0
 * 
 * @author Cássio
 * @version 1.1
 */
public class AtividadeBO {
	
	private AtividadeDAO dao = new AtividadeDAO();
	
	public List<AtividadeDTO> listarTodos(Long dataAtualizacao) {
		System.out.println("Gerando Atividade");

		dao.beginTransaction();
		List<AtividadeDTO> atividadeDTOs =   dao.listarTodos(dataAtualizacao);
		
				
		return atividadeDTOs ;
	}
	
}
