package br.edu.univas.CRUD.Clube;

import javax.persistence.EntityManager;
import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class UpdateClube {
	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		int clubeId = 6;
		Clube objClube = em.find(Clube.class, clubeId);// busca o cargo
		if (objClube != null) { // se achar, faz update

			objClube.setClubeCnpj(100);
			objClube.setClubeCidade("cambui");
			objClube.setClubeNome("Samuel");
			
			em.getTransaction().begin();
			em.merge(objClube); // faz o update
			em.getTransaction().commit();
		} else {
			System.out.println("Cargo " + clubeId + " nÃ£o encontrado.");
		}
	}
}
