package br.event.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.event.model.Atividade;
import br.event.util.ConexaoUtil;

/**
 * 
 * Classe responsável por conter os metodos do CRUD
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 01:55:13
 * @version 1.0
 */
public class AtividadeDAO {

	private static AtividadeDAO instance;
	
	
	/**
	 * 
	 * Método responsável por criar uma instancia da classe ClienteDAO (Singleton)
	 *
	 * @return
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:03:47
	 * @version 1.0
	 */
	public static AtividadeDAO getInstance(){
		if(instance == null)
			instance = new AtividadeDAO();
		return instance;
	}
	
	/**
	 * 
	 * Método responsável por listar todos os clientes do banco
	 *
	 * @return ArrayList<CLiente> clientes
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:01:35
	 * @version 1.0
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public ArrayList<Atividade> listarTodos() throws ClassNotFoundException, SQLException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Atividade> atividades = null;
		
		conexao = ConexaoUtil.getConexao();
		atividades = new ArrayList<Atividade>();
		try {
			pstmt = conexao.prepareStatement("select * from event_e.TB_ATIVIDADE)");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Atividade atividade = new Atividade();
				
				atividade.setIdAtividade(rs.getInt("ID_ATIVIDADE"));
				atividade.setIdLocal(rs.getInt("ID_LOCAL"));
				atividade.setIdSubEvento(rs.getInt("ID_SUB_EVENTO"));
				atividade.setSigla(rs.getString("SIGLA"));
				atividade.setTipo(rs.getString("TIPO"));
				atividade.setTitulo(rs.getString("TITULO"));
				atividade.setDescricao(rs.getString("DESCRICAO"));
				atividade.setData(rs.getLong("DATA"));
				atividade.setHoraInicio(rs.getLong("HORA_INICIO"));
				atividade.setHoraFim(rs.getLong("HORA_FIM"));
				atividade.setDtCadastro(rs.getLong("DT_CADASTRO"));
				atividade.setDtAlteracao(rs.getLong("DT_ALTERACAO"));
				atividades.add(atividade);
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao listar todos os clientes: " + e);
			e.printStackTrace();
		}
		return atividades;
	}
	
}
