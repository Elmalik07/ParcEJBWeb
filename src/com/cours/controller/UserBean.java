package com.cours.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.cours.dao.IUser;
import com.cours.dao.UserImpl;
import com.cours.entities.User;

@ManagedBean(name="userbean")
@RequestScoped
public class UserBean {
	
	@EJB
	private IUser user_dao;
	private User user = new User();
	private String email;
	private String password;
	
	private List<User> users = new ArrayList<User>();
	
	
	public UserBean () {
		
		
	}
	
	public String getAllUser(){
	
		return "/view/user/liste.xhtml";
		
		
	}
	
	public String getConnexion(){
		String url = "index.xhtml";
		try {
			User u = user_dao.getLogin(email, password);
			if (u != null) {
				url = "accueil.xhtml";
				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			url = "index.xhtml";
		}
		
		
		//System.out.println(user.getEmail()+" "+user.getPassword());
		
		return url;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String addUser(){
		
		try {
			
			user_dao.add(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		users = user_dao.getAllUsers();
		return "/view/user/liste.xhtml";
	}
	

}
