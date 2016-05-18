package br.event.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.event.model.Atividade;
import br.event.util.JpaUtil;

/**
 * 
 * Classe responsável por conter os metodos do CRUD
 *
<<<<<<< HEAD
 * @author 
 * @since 
 * @version 1.0
 */
public class AtividadeDAO {

	private static AtividadeDAO atividadeDAO;
	private List<Atividade> atividades;
	static EntityManager fabrica = JpaUtil.getFactory();
	
	/**
	 * 
	 * Método responsável por criar uma instancia da classe ClienteDAO (Singleton)
	 *
	 * @return
	 * @author 
	 * @since 
	 * @version 1.0
	 */
	public static AtividadeDAO getInstance(){
		if(atividadeDAO == null)
			atividadeDAO = new AtividadeDAO();
		return atividadeDAO;
	}

	
	/**
	 * 
	 * Método responsável por listar todos os clientes do banco
	 *
	 * @return 
	 * @author  
	 * @since 
	 * @version 1.0
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Atividade> listarTodos() throws ClassNotFoundException, SQLException{
		
		
		Connection conexao = null;
		
		try {
		
			Query query = fabrica.createNamedQuery("Atividade.ListAll");
			atividades = query.getResultList();
					
//			conexao = ConexaoUtil.getConexao();
//			atividades = new ArrayList<Atividade>();
//			StringBuilder sql = new StringBuilder();
//			sql.append("select * from event_e.TB_ATIVIDADE");
//			PreparedStatement pstmt = conexao.prepareStatement(sql.toString());
//			ResultSet rs = pstmt.executeQuery();
//			
//			while(rs.next()){
//				Atividade atividade = new Atividade();
//				
//				atividade.setIdAtividade(rs.getInt("ID_ATIVIDADE"));
//				atividade.setSigla(rs.getString("SIGLA"));
//				atividade.setTipo(rs.getString("TIPO"));
//				atividade.setTitulo(rs.getString("TITULO"));
//				atividade.setDescricao(rs.getString("DESCRICAO"));
//				atividade.setData(rs.getLong("DATA"));
//				atividade.setHoraInicio(rs.getLong("HORA_INICIO"));
//				atividade.setHoraFim(rs.getLong("HORA_FIM"));
//				atividade.setDtCadastro(rs.getLong("DT_CADASTRO"));
//				atividade.setDtAlteracao(rs.getLong("DT_ALTERACAO"));
//				atividades.add(atividade);
//			}
			
		} catch (Exception e) {
			System.out.println("Erro ao listar as atividades ->> " + e);

			e.printStackTrace();
		}
		return atividades;
	}
	
}
