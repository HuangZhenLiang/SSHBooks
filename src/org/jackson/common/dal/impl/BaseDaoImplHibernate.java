package org.jackson.common.dal.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.jackson.common.dao.BaseDao;

public class BaseDaoImplHibernate<T> implements BaseDao<T> {
	private SessionFactory factory=null;
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public T get(Class<T> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		return (T)factory.getCurrentSession().load(entityClass, id);
	}

	@Override
	public Serializable save(T entity) {
		// TODO Auto-generated method stub
		return factory.getCurrentSession().save(entity);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().delete(entity);
	}

	@Override
	public void delete(Class<T> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().createQuery("delete en from "+entityClass.getSimpleName()
				+" en where en.id=?0").setParameter("0", id).executeUpdate();
				
	}

	@Override
	public List<T> findAll(Class<T> entityClass) {
		// TODO Auto-generated method stub
		return (List<T>)factory.getCurrentSession().createQuery("from "+entityClass.getSimpleName()).list();
	}

	@Override
	public long findCount(Class<T> entityClass) {
		// TODO Auto-generated method stub
		List<?> l=factory.getCurrentSession().createQuery("select count(*) from "+entityClass.getSimpleName()).list();
		if(l!=null &&l.size()==1){
			return (long)l.get(0);
		}
		return 0L;
	}

}
