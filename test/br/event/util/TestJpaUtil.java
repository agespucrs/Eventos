package br.event.util;

import javax.persistence.EntityManager;

import br.event.model.Atividade;

public class TestJpaUtil {
	static EntityManager fabrica = JpaUtil.getFactory();

	public static void main(String[] args) {
		fabrica.getTransaction().begin();
		Atividade atividade = fabrica.find(Atividade.class, 1);
		System.out.println("_____________________________________________");
		System.out.println(atividade);
		System.out.println("_____________________________________________");
		fabrica.getTransaction().commit();
		fabrica.close();
}
}
