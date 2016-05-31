package br.event.bo;

import java.sql.SQLException;
import java.util.List;

import br.event.dao.AtividadeDAO;
import br.event.model.Atividade;

/**
 * 
 * Classe responsável por ser o controlador entre o resource e a camada DAO
 *

 * @author Andre Farias
 * @since 17/05/2016
 * @version 1.0
 */
public class AtividadeBO {
	
	public List<Atividade> listarTodos(Long dataAtualizacao) throws ClassNotFoundException, SQLException{
		System.out.println("Gerando Atividade");

		AtividadeDAO dao = new AtividadeDAO();
		List<Atividade> atividades =  dao.listarTodos(dataAtualizacao);
		
		return atividades;
	}
	
}
