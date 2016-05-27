package br.even.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.event.bo.NoticiaBO;
import br.event.model.Noticia;
import br.event.util.Constantes;


@SessionScoped
@ManagedBean(name="noticiaMB")
public class NoticiaMB extends AbstractMB implements Serializable{

	public static final String INJECTION_NAME = "#{noticiaMB}";
	private static final long serialVersionUID = -8730439332529169568L;
  private Noticia noticia;	
  private NoticiaBO bo;
  
  public NoticiaMB() {
  	noticia = new Noticia();
  	bo = new NoticiaBO();
  }
  

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	
  public void  createNoticia(){
  	try {
  		bo.createNoticia(noticia);
  		displayInfoMessageToUser(Constantes.MSG_SUC_NOTICIA);
  		resetNoticia();
  		
		} catch (Exception e) {
			displayErrorMessageToUser(Constantes.MSG_ERR_NOTICIA);
			e.printStackTrace();
		}
		
  }
  
  public List<Noticia> listaNoticias() {
  	List<Noticia> noticias = new ArrayList<>(); 
  	noticias = bo.listAll();
  	return noticias;
	}
	
  public void resetNoticia() {
  	noticia = new Noticia();
	}
  
  
}
