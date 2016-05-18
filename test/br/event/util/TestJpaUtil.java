package br.event.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.event.model.Atividade;

public class TestJpaUtil {
	static EntityManager fabrica = JpaUtil.getFactory();

	public static void main(String[] args) {
		fabrica.getTransaction().begin();
		Query query = fabrica.createNamedQuery("Atividade.ListAll");
		//Atividade atividade = fabrica.find(Atividade.class, 1);
		System.out.println("_____________________________________________");
		List<Atividade> atividades = query.getResultList();
		for (Atividade atividade : atividades) {
			System.out.println("Titulo: "	+ atividade.getTitulo());
		}
		
		
		//	System.out.println(atividade);
		System.out.println("_____________________________________________");
		fabrica.getTransaction().commit();
		fabrica.close();
}
}
