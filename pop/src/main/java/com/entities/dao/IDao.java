package com.entities.dao;

import java.util.List;

public interface IDao<T, K> {

	public void store(T t);
	public T findById(K k);
	public List<T> all();
}
