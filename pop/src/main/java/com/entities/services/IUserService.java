package com.entities.services;

import java.util.List;

import com.entities.Account;
import com.entities.Profile;

public interface IUserService {

	public Account addAccount(Account a);
	public Account addAccount(String login,String pass);
	public Account sigin(String log,String pass);
	public List<Account> Accounts();
	public Account findAccount(Long id);
	public Profile addProfile(Profile a);
	public Profile findProfile(Long id);


}
