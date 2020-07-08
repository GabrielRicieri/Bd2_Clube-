package br.edu.univas.CRUD.Associados;

import java.util.Date;

import javax.persistence.EntityManager;
import br.edu.univas.entities.Associado;
import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class UpdateAssociado {
	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		Clube clube = new Clube();
		clube.setClubeId(6);
		int associadoId = 8;
		Associado objAssociado = em.find(Associado.class, associadoId);// busca o cargo 
		if (objAssociado != null) { // se achar, faz update

			objAssociado.setAssociadoNome("joao");
			objAssociado.setAssociadoDate(new Date());
			objAssociado.setAssociadoCpf(10000000);
			objAssociado.setClubeId(clube);
			
			em.getTransaction().begin();
			em.merge(objAssociado); // faz o update
			em.getTransaction().commit();
		} else {
			System.out.println("Cargo " + associadoId + " nÃ£o encontrado.");
		}
	}
}
