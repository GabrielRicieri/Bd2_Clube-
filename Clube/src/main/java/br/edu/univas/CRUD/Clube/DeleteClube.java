package br.edu.univas.CRUD.Clube;

import javax.persistence.EntityManager;
import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class DeleteClube {
	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		int clubeId = 5;
		Clube objClube = em.find(Clube.class, clubeId);
		if (objClube != null) { // se achar, faz delete
			em.getTransaction().begin();
			em.remove(objClube); // remove o cargo
			em.getTransaction().commit();
		} else {
			System.out.println("Cargo " + clubeId + " nÃ£o encontrado.");
		}
	}
}
