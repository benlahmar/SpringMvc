package com.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Account;
import com.entities.Profile;
import com.entities.dao.AccountRepo;
import com.entities.dao.ProfileRepo;

@Service
public class ServiceAccount implements IUserService {
	@Autowired
	AccountRepo arepo;
	@Autowired
	ProfileRepo prepo;
	@Override
	public Account addAccount(Account a) {
		// TODO Auto-generated method stub
		return arepo.save(a);
	}
	@Override
	public Account addAccount(String login, String pass) {
		Account a =new Account();
		a.setLogin(login);
		a.setPassword(pass);
		a.setRole("user");
		return arepo.save(a);
	}
	@Override
	public Account sigin(String log, String pass) {
		 List<Account> a = arepo.findByLoginAndPassword(log, pass);
		if(a.size()>0)
		return a.get(0);
		else
			return null;
	}
	@Override
	public List<Account> Accounts() {
		// TODO Auto-generated method stub
		return (List<Account>) arepo.findAll();
	}
	@Override
	public Account findAccount(Long id) {
		// TODO Auto-generated method stub
		return arepo.findOne(id);
	}
	@Override
	public Profile addProfile(Profile a) {
		// TODO Auto-generated method stub
		return prepo.save(a);
	}
	@Override
	public Profile findProfile(Long id) {
		// TODO Auto-generated method stub
		return prepo.findOne(id);
	}
	
	
}
