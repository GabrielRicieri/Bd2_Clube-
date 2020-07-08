package br.edu.univas.CRUD.Associados;
import br.edu.univas.entities.Associado;
import br.edu.univas.entities.Associado;

import java.util.Date;

import javax.persistence.EntityManager;
import br.edu.univas.entities.Clube;
import br.edu.univas.ultils.HibernateUtil;

public class InsertAssociado {
	public static void main(String[] args) {
		//objeto de teste
		Clube clube = new Clube();
		clube.setClubeId(6);
		Associado associado = new Associado();
		
		associado.setAssociadoNome("lyly");
		associado.setAssociadoDate(new Date());
		associado.setAssociadoCpf(142145791);
		associado.setClubeId(clube);

		// obtem a instancia do EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();

		// persistir o objeto 
		em.getTransaction().begin();// inicia a transação
		em.persist(associado);
		em.getTransaction().commit();// finaliza a transação
	}
}
