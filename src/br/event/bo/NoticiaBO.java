package br.event.bo;

import java.sql.SQLException;
import java.util.List;

import br.event.dao.NoticiaDAO;
import br.event.model.Noticia;

public class NoticiaBO {
	private NoticiaDAO dao = new NoticiaDAO();

	public List<Noticia> listarTodas(String status) throws ClassNotFoundException, SQLException {
	
		System.out.println("Gerando Noticias");
		dao.beginTransaction();
		List<Noticia> noticias = dao.listarTodas(status);
		
		return noticias; 
	}
	
	public void createNoticia(Noticia noticia){
		dao.beginTransaction();
		dao.save(noticia);
		dao.commitAndCloseTransaction();
	}
	
}
