package br.even.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.event.bo.NoticiaBO;
import br.event.model.Noticia;


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
	
  public void createNoticia(){
  	try {
  		bo.createNoticia(noticia);
  		displayInfoMessageToUser("Criado Noticia com SUCESSO");
  		resetNoticia();
		} catch (Exception e) {
			displayErrorMessageToUser("ERRO na criação de noticias");
			e.printStackTrace();
		}
  	
  }
	
  public void resetNoticia() {
  	noticia = new Noticia();
	}
}
