package com.cours.dao;

import java.util.List;

import javax.ejb.Local;

import com.cours.entities.Serveur;
@Local
public interface IServeur {
	 public int add(Serveur serveur);
	    public int delete(int idServ);
	    public int update(Serveur serveur);
	    public Serveur get(int idServ);
	    public List<Serveur> list();

}
