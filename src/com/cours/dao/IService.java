package com.cours.dao;

import java.util.List;

import javax.ejb.Local;

import com.cours.entities.Service;

@Local
public interface IService {
	public int add(Service service);
    public int delete(int idS);
    public int update(Service service);
    public Service get(int idS);
    public List<Service> list();

}
