package org.jackson.common.dao;

import java.io.Serializable;
import java.util.List;
public interface BaseDao<T> {
	T get(Class<T> entityClass, Serializable id);
	Serializable save(T entity);
	void update(T entity);
	void delete(T entity);
	void delete(Class<T> entityClass, Serializable id);
	List<T> findAll(Class<T> entityClass);
	long findCount(Class<T> entityClass);
}
