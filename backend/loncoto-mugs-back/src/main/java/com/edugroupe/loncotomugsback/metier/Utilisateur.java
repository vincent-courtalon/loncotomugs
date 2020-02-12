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
public class Utilisateur {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
	@Column (length = 100, unique = true ,nullable = false) private String login;
	@JsonIgnore @Column (length = 100, nullable = false)    private String password;
	
															private boolean enabled;
	@ManyToMany	/*(fetch=FetchType.EAGER)*/					private Set<Role> roles;
	
	
															
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Utilisateur(int id, String login, String password, boolean enabled) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.enabled = enabled;
		
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


}
