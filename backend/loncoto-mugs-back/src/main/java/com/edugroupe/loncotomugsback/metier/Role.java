package com.edugroupe.loncotomugsback.metier;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Role {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (length=100, unique=true, nullable=false)
	private String rolename;
	@ManyToMany(mappedBy = "roles") @JsonIgnore
	private Set<Utilisateur> utilisateur;
	
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Role(int id, String rolename, Set<Utilisateur> utilisateur) {
		super();
		this.id = id;
		this.rolename = rolename;
		this.utilisateur = utilisateur;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the rolename
	 */
	public String getRolename() {
		return rolename;
	}
	/**
	 * @param rolename the rolename to set
	 */
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	/**
	 * @return the utilisateur
	 */
	public Set<Utilisateur> getUtilisateur() {
		return utilisateur;
	}
	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Set<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}
	


}
