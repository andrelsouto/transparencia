package dao;

import javax.persistence.EntityManager;

import util.JPAUtil;

public class GenericDao<T> {
	
	private EntityManager manager = new JPAUtil().getEntityManager();
	
	public void save(T entity){
		
		if(!this.manager.getTransaction().isActive()) this.manager.getTransaction().begin();
		this.manager.persist(entity);
		
	}
	
	public void commit() {
		
		this.manager.getTransaction().commit();
		this.manager.close();
		
	}
	
}
