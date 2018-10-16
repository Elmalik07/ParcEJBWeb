package com.cours.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Serveur {
    // attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idServ;
	@Column
    private String nomServ;
	@Column
    private String adripServ;
	@Column
    private String salleServ;
	@OneToMany(mappedBy="serveur")
	private List<Service> services = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="user_ID")
	private User user = new User();
			

    // constructeurs
    public Serveur() {

    }
    
    //methodes
    public String getNomServ(){
        return this.nomServ;
    }
    public void setNomServ(String nomServ){
        this.nomServ = nomServ;
    }

    public String getAdripServ() {
        return this.adripServ;
    }

    public void setAdripServ(String adripServ) {
        this.adripServ = adripServ;
    }
    public String getSalleServ(){
        return this.salleServ;
    }

    public void setSalleServ(String salleServ){
        this.salleServ = salleServ;
    }

    public int getidServ() {
        return idServ;
    }

    public void setidServ(int idServ) {
        this.idServ = idServ;
    }
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getIdServ() {
		return idServ;
	}
	public void setIdServ(int idServ) {
		this.idServ = idServ;
	}
	
	
    
}
