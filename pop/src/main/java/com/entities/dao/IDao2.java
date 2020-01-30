package com.entities.dao;

import java.util.List;

import com.entities.Account;
import com.entities.Profile;

public interface IDao2 {

	public void AddProfile(Profile p);
	public void addAccount2profile(Account a, Long idp);
	
	public Profile findProfileById(Long id);
	public Account findAccountById(Long id);
	
	List<Account> allAccount4profile(Long idp);
	
	
}
