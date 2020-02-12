package com.edugroupe.loncotomugsback.metier;

import java.nio.ByteBuffer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private	int id;
	private String nom;
	private int hauteur;
	private int largeur;
	private int taille;
	private String contentType;
	private ByteBuffer donnee;
	
	public Image() {
	}

	public Image(int id, String nom, int hauteur, int largeur, int taille, String contentType, ByteBuffer donnee) {
		super();
		this.id = id;
		this.nom = nom;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.taille = taille;
		this.contentType = contentType;
		this.donnee = donnee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public ByteBuffer getDonnee() {
		return donnee;
	}

	public void setDonnee(ByteBuffer donnee) {
		this.donnee = donnee;
	}

}
