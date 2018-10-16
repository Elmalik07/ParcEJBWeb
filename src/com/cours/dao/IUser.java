package com.cours.dao;

import java.util.List;

import javax.ejb.Local;

import com.cours.entities.User;

@Local
public interface IUser {
	public Long add(User user);
	public Long update(User user);
	public Long delete(int id);
	public List<User> getAllUsers();
	public User get(int id);
	public User getLogin(String email, String password);

}
