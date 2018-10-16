package com.cours.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.cours.entities.Serveur;

@ManagedBean(name="serveurbean")
@RequestScoped
public class ServeurBean {
	private Serveur serveur = new Serveur();
	private List<Serveur> serveurs = new ArrayList<Serveur>();
	private int id;
	private String bvalider;
	private String bannuler;
	private String bmodifier;
	private String bsupprimer;
	
	//tout ce qui est declare doit avoir un getter et un setter sauf pour la partie acces aux donnees
	
	
	public ServeurBean(){
		bvalider = "Valider";
		bannuler = "Annuler";
		
	}
	
	public String getAllServeur(){
		
		
		return "/view/serveur/liste.xhtml";
	}
	public String removeServeur(){
		if(id != 0)
			
		
		
		serveur = new Serveur();
		
		
		return "/view/serveur/liste.xhtml"; 
	}
	public String updateServeur(){
		serveur = new Serveur();
		
		return "/view/serveur/liste.xhtml"; 
	}
	public String editServeur(){
	
		//gestioon des boutons (hidden et visible: valider, annuler, modifier, supprimer)
		bvalider = null;
		bannuler = null;
		bmodifier = "Modifier";
		bsupprimer = "Supprimer";
		

		
		return "/view/serveur/liste.xhtml";
	}
	public String addServeur(){

		serveur = new Serveur();//vider les champs au niveau du formulaire apres ajout

		
		return "/view/serveur/liste.xhtml";
	}
	
	public String resetServeur(){
		serveur = new Serveur();//vider les champs au niveau du formulaire apres ajout

		
		return "/view/serveur/liste.xhtml";
		
	} 

	public Serveur getServeur() {
		return serveur;
	}

	public void setServeur(Serveur serveur) {
		this.serveur = serveur;
	}

	public List<Serveur> getServeurs() {
		return serveurs;
	}

	public void setServeurs(List<Serveur> serveurs) {
		this.serveurs = serveurs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBvalider() {
		return bvalider;
	}

	public void setBvalider(String bvalider) {
		this.bvalider = bvalider;
	}

	public String getBannuler() {
		return bannuler;
	}

	public void setBannuler(String bannuler) {
		this.bannuler = bannuler;
	}

	public String getBmodifier() {
		return bmodifier;
	}

	public void setBmodifier(String bmodifier) {
		this.bmodifier = bmodifier;
	}

	public String getBsupprimer() {
		return bsupprimer;
	}

	public void setBsupprimer(String bsupprimer) {
		this.bsupprimer = bsupprimer;
	}

}
