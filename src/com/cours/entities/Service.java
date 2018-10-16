package com.cours.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Service {
    //attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idS;
	@Column
    private String nomS;
	@Column
    private int port;
	@ManyToOne
	@JoinColumn(name="serveur_ID")
    private Serveur serveur = new Serveur();
	@ManyToOne
	@JoinColumn(name="user_ID")
	private User user = new User();
    //constructeurs
    public Service(){

    }
    
    //methodes

    public String getNomS() {
        return this.nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Serveur getServeur() {
        return this.serveur;
    }

    public void setServeur(Serveur serveur) {
        this.serveur = serveur;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    
}

