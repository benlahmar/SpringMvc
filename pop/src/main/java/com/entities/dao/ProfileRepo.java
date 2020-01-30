package com.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.entities.Profile;

public interface ProfileRepo extends CrudRepository<Profile, Long> {

}
