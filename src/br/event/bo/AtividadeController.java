package br.event.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.event.dao.AtividadeDAO;
import br.event.model.Atividade;

/**
 * 
 * Classe responsável por ser o controlador entre o resource e a camada DAO
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 02:04:21
 * @version 1.0
 */
public class AtividadeController {
	
	public ArrayList<Atividade> listarTodos() throws ClassNotFoundException, SQLException{
		System.out.println("Enviando para o GIT");
		return AtividadeDAO.getInstance().listarTodos();
	}
	
}
