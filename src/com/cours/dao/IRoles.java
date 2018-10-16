package com.cours.dao;

import java.util.List;

import javax.ejb.Local;

import com.cours.entities.Roles;

@Local
public interface IRoles {
	public Long add(Roles roles);
	public Long update(Roles roles);
	public Long delete(int id);
	public List<Roles> getAllRoles();
	public Roles get(int id);

}
