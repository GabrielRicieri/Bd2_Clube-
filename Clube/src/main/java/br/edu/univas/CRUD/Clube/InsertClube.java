package br.edu.univas.CRUD.Clube;

import javax.persistence.EntityManager;

import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class InsertClube {
	public static void main(String[] args) {
		// objeto de teste
		Clube clube = new Clube();
		
		clube.setClubeCnpj(124);
		clube.setClubeCidade("bomrepouso");
		clube.setClubeNome("Joao");

		// obtem a instancia do EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();

		// persistir o objeto (dentro de uma transação)
		em.getTransaction().begin();// inicia a transação
		em.persist(clube);
		em.getTransaction().commit();// finaliza a transação
	}
}
