package br.event.util;

import java.util.ResourceBundle;

/**
 * Constantes do sistema
 * @author cassio trindade
 *
 */
public class Constantes {
//br.ages.crud.util.config_bd ambiente
	public static final String AMBIENTE_PROPERTIES = "ambiente";
	public static final String CONEXAO_BD_DRIVE = "conexao.driver.mysql";
	public static final String CONEXAO_BD_URL = "conexao.url";
	public static final String CONEXAO_BD_USER = "conesao.user";
	public static final String CONEXAO_BD_PASSWORD = "conexao.password";
	
	public static final String VERSAO_SISTEMA = "version";

	
	public static final String MSG_SUC_NOTICIA = ResourceBundle.getBundle("resources.messages").getString("msgSucNoticia");
	public static final String MSG_ERR_NOTICIA = ResourceBundle.getBundle("resources.messages").getString("msgErrNoticia");
	
	public static final String MSG_SUC_DEL_NOTICIA = ResourceBundle.getBundle("resources.messages").getString("msgSucDelNoticia");
	public static final String MSG_ERR_DEL_NOTICIA = ResourceBundle.getBundle("resources.messages").getString("msgErrDelNoticia");
	
	public static final String MSG_SUC_ALT_NOTICIA = ResourceBundle.getBundle("resources.messages").getString("msgSucAltNoticia");
	public static final String MSG_ERR_ALT_NOTICIA = ResourceBundle.getBundle("resources.messages").getString("msgErrAltNoticia");
	
	
		
}
