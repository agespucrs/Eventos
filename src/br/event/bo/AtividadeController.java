package br.event.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.event.dao.AtividadeDAO;
import br.event.model.Atividade;

/**
 * 
 * Classe responsável por ser o controlador entre o resource e a camada DAO
 *
<<<<<<< HEAD
 * @author Andre Farias
 * @since 17/05/2016
 * @version 1.0
 */
public class AtividadeController {
	
	public ArrayList<Atividade> listarTodos() throws ClassNotFoundException, SQLException{
		System.out.println("Gerando Atividade");

		return AtividadeDAO.getInstance().listarTodos();
	}
	
}
