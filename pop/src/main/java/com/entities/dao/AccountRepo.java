package com.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.entities.Account;
import java.lang.String;
import java.util.List;

public interface AccountRepo extends CrudRepository<Account, Long>{
List<Account> findByLoginAndPassword(String login,String password);
}
