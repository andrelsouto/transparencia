package dao;

import javax.persistence.EntityManager;

import models.Transferencia;
import util.JPAUtil;

public class TransferenciaDao {
	
	private EntityManager manager = new JPAUtil().getEntityManager();
	
	public void save(Transferencia transferencia) {
		
		if(!manager.getTransaction().isActive()) manager.getTransaction().begin();
		manager.persist(transferencia);		
	}
	
	public void commit() {
//		if(manager.getTransaction().isActive()) {
//			System.out.println("Ativa");
//			manager.close();
//			return ;
//		}
		manager.getTransaction().commit();
		manager.close();
	}

}
