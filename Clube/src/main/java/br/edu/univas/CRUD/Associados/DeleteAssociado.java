package br.edu.univas.CRUD.Associados;

import javax.persistence.EntityManager;
import br.edu.univas.entities.Associado;
import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class DeleteAssociado {
	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		int associado_id = 9;
		Associado objAssociado = em.find(Associado.class, associado_id);
		if (objAssociado != null) { // se achar, faz delete
			em.getTransaction().begin();
			em.remove(objAssociado); // remove o cargo
			em.getTransaction().commit();
		} else {
			System.out.println("Associado " + associado_id + " nÃ£o encontrado.");
		}
	}
}
