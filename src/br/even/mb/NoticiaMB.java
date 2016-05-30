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
  private boolean btnSalvar;
  private boolean btnCadastrar;
  
  public NoticiaMB() {
  	noticia = new Noticia();
  	bo = new NoticiaBO();
  	btnCadastrar = true;
  }
  
	public Noticia getNoticia() {
		return noticia;
	}

	public synchronized void setNoticia(Noticia noticia) {
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
 
  public void  editNoticia(){
  	try {
  		bo.editNoticia(noticia);
  		displayInfoMessageToUser(Constantes.MSG_SUC_ALT_NOTICIA);
  		resetNoticia();
  		botoes();
  	} catch (Exception e) {
  		displayErrorMessageToUser(Constantes.MSG_ERR_ALT_NOTICIA);
  		e.printStackTrace();
  	}
  }
  
  public void  deleteNoticia(){
  	try {
  		bo.deleteNoticia(noticia);
  		displayInfoMessageToUser(Constantes.MSG_SUC_DEL_NOTICIA);
  		resetNoticia();
  		
  	} catch (Exception e) {
  		displayErrorMessageToUser(Constantes.MSG_ERR_DEL_NOTICIA);
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

   public void botoes(){
  	if(btnCadastrar == true){
  		btnSalvar = true;
  		btnCadastrar = false;
  	} else if(btnCadastrar == false){
  		btnSalvar = false;
  		btnCadastrar = true;
  	}
   }
  
	public boolean isBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(boolean btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public boolean isBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(boolean btnEditar) {
		this.btnCadastrar = btnEditar;
	}
  
}
