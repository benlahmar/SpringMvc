package com.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue
	Long idcmd;
	LocalDate date;
	
	@ManyToOne
	Account account;
	
	@OneToMany(mappedBy = "commande", fetch = FetchType.EAGER)
	List<Composant> composants=new ArrayList<Composant>();

	/**
	 * @return the idcmd
	 */
	public Long getIdcmd() {
		return idcmd;
	}

	/**
	 * @param idcmd the idcmd to set
	 */
	public void setIdcmd(Long idcmd) {
		this.idcmd = idcmd;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the composants
	 */
	public List<Composant> getComposants() {
		return composants;
	}

	/**
	 * @param composants the composants to set
	 */
	public void setComposants(List<Composant> composants) {
		this.composants = composants;
	}

	@Override
	public String toString() {
		return "Commande [idcmd=" + idcmd + ", date=" + date + ", account=" + account.getLogin() + "]";
	}
	
	
}
