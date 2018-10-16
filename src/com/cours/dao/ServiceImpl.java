package com.cours.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cours.entities.Service;

@Stateless
public class ServiceImpl implements IService {
	
	@PersistenceContext(unitName="ParcEJBWeb")
	private EntityManager em;

	@Override
	public int add(Service service) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.persist(service);
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public int delete(int idS) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.remove(em.find(Service.class, idS));
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public int update(Service service) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.merge(service);
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public Service get(int idS) {
		
		return em.find(Service.class, idS);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Service> list() {
		
		return em.createQuery("SELECT s FROM Service s").getResultList();	
		
	}

}
