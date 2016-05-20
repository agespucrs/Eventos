package br.event.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="TB_NOTICIAS")
@NamedQueries({
	@NamedQuery(name = "Noticia.ListAll", query = "SELECT n FROM Noticia n where n.status = :status")
})
public class Noticia implements Serializable{

	private static final long serialVersionUID = -6354297789588987770L;
	public static final String LISTA_NOTICIAS_ATIVAS = "Noticia.ListAll";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_NOTICIA")
	private int idNoticia;
	private String titulo;
	private String texto;
	@Column(name="DT_CADASTRO")
	private long dtCadastro;
	@Column(name="DT_ALTERACAO")
	private long dtAlteracao;
	private String status;

	public Noticia() {	}
	
	public int getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public long getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(long dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public long getDtAlteracao() {
		return dtAlteracao;
	}
	public void setDtAlteracao(long dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Noticias [idNoticia=" + idNoticia + ", titulo=" + titulo + ", texto=" + texto + ", dtCadastro=" + dtCadastro + ", dtAlteracao=" + dtAlteracao + ", status=" + status + "]";
	}
	
	
}
