package br.edu.univas.CRUD.Associados;

import java.util.List;
import br.edu.univas.entities.Associado;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.edu.univas.ultils.HibernateUtil;

public class SelectAssociado {
	
	public static void main(String[] args) {
	EntityManager em = HibernateUtil.getEntityManager();

	String ql = "select a from Associado a"; // define a consulta
	
	TypedQuery<Associado> query = em.createQuery(ql, Associado.class); // cria a query
	
	List<Associado> associado = query.getResultList();// executa a consulta
	
	System.out.println("Associados: " + associado); // imprimir os cargos
}
}
