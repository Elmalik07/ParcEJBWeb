package com.cours.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.cours.entities.Serveur;

@Stateless
public class ServeurImpl implements IServeur {
	
	@PersistenceContext(unitName="ParcEJBWeb")
	private EntityManager em;

	@Override
	public int add(Serveur serveur) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.persist(serveur);
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public int delete(int idServ) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.remove(em.find(Serveur.class, idServ));
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public int update(Serveur serveur) {
		int ok = 0;
		try {
			em.getTransaction().begin();
			em.merge(serveur);
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public Serveur get(int idServ) {
		
		return em.find(Serveur.class, idServ);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Serveur> list() {
		
		return em.createQuery("SELECT s FROM Serveur s").getResultList();
	}

}
