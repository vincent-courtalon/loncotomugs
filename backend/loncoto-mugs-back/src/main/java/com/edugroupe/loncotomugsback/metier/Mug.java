package com.edugroupe.loncotomugsback.metier;

import java.nio.ByteBuffer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mug {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private	int id;
	private String nom;
	private int hauteur;
	private int largeur;
	private int taille;
	private String couleur;
	private double prix;
	private ByteBuffer donnee;
	public Mug(int id, String nom, int hauteur, int largeur, int taille, String couleur, double prix,
			ByteBuffer donnee) {
		super();
		this.id = id;
		this.nom = nom;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.taille = taille;
		this.couleur = couleur;
		this.prix = prix;
		this.donnee = donnee;
	}
	public Mug() {
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
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public ByteBuffer getDonnee() {
		return donnee;
	}
	public void setDonnee(ByteBuffer donnee) {
		this.donnee = donnee;
	}

}
