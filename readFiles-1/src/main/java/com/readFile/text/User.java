package com.readFile.text;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "Usename")
	private String Usename;

	@Column(name = "Firstname")
	private String Firstname;

	@Column(name = "Lastname")
	private String Lastname;

	@Column(name = "Password")
	private String Password;

	private String status;

	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the usename
	 */
	public String getUsename() {
		return Usename;
	}

	/**
	 * @param usename
	 *            the usename to set
	 */
	public void setUsename(String usename) {
		Usename = usename;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return Firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return Lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
