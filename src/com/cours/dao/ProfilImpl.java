package com.cours.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cours.entities.Profil;
import com.cours.entities.User;

@Stateless
public class ProfilImpl implements IProfil {
	
	@PersistenceContext(unitName="ParcEJBWeb")
	private EntityManager em;
	
	
	@Override
	public Long add(Profil profil) {
		long ok = 0;
		try {
			em.getTransaction().begin();
			em.persist(profil);
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public Long update(Profil profil) {
		long ok = 0;
		try {
			em.getTransaction().begin();
			em.merge(profil);
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@Override
	public Long delete(int id) {
		long ok = 0;
		try {
			em.getTransaction().begin();
			em.remove(em.find(Profil.class, id));
			em.getTransaction().commit();
			ok = 1;
		} catch (Exception e) {
			e.printStackTrace();
			ok = 0;
		}
		
		return ok;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profil> getAllProfils() {
		
		return em.createQuery("SELECT p FROM Profil p").getResultList();
	}

	@Override
	public Profil get(int id) {
		
		return em.find(Profil.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsersByProfil(int idProfil) {
		
		return em.createQuery("SELECT p.users FROM Profil p WHERE p.id=:id")
							.setParameter("id", idProfil)
							.getResultList();
	}
	

}
