package br.event.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.event.dao.NoticiaDAO;
import br.event.model.Noticia;

public class NoticiaBO {
	private NoticiaDAO dao = new NoticiaDAO();
	private List<Noticia> list = new ArrayList<>();

	public List<Noticia> listarTodas(String status) throws ClassNotFoundException, SQLException {

		System.out.println("Gerando Noticias");
		dao.beginTransaction();
		List<Noticia> noticias = dao.listarTodas(status);
		return noticias;
	}

	public void createNoticia(Noticia noticia) {
		dao.beginTransaction();
		dao.save(noticia);
		dao.commitAndCloseTransaction();
	}

	public void editNoticia(Noticia noticia) {
		dao.beginTransaction();
		dao.findReferenceOnly(noticia.getIdNoticia());
		dao.update(noticia);
		dao.commitAndCloseTransaction();
	}
	
	public void deleteNoticia(Noticia noticia) {
		dao.beginTransaction();
		dao.delete(noticia.getIdNoticia(), Noticia.class);
		dao.commitAndCloseTransaction();
	}

	public List<Noticia> listAll(){
		dao.beginTransaction();
		list = dao.findAll();
		return list;
	}
	
	public void deleteNoticia(int id){
		dao.beginTransaction();
		dao.delete(id, Noticia.class);
	}

}
