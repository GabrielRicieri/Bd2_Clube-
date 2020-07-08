package br.edu.univas.CRUD.Clube;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class SelectClube {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		String ql = "select c from Clube c"; // define a consulta
		
		TypedQuery<Clube> query = em.createQuery(ql, Clube.class); // cria a query
		
		List<Clube> clube = query.getResultList();// executa a consulta
		
		System.out.println("Clubes: " + clube); // imprimir os cargos
	}
}
