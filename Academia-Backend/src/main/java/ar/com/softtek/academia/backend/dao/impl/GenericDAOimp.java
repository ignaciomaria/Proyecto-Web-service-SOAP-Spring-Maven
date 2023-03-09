package ar.com.softtek.academia.backend.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.com.academia.exceptions.PersistenceException;
import ar.com.softtek.academia.backend.dao.IGenericDAO;


public class GenericDAOimp<T> implements IGenericDAO<T>{
	
	//Variables
	
	protected SessionFactory sessionFactory;
	
	protected Class<T> type;
	
	//Constructor
	protected GenericDAOimp(Class<T> type) {
		this.type = type;
	}
	
	public GenericDAOimp() {}
	
	public Class<T> getType() {
		return type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		String hql = "FROM Socio";
		Query query = session.createQuery(hql);
		List<T> resultados = query.list();
		session.getTransaction().commit();
		session.close();
		return resultados;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T getByName(String nombre) throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		T resultados = null;
		if(nombre != null) {
		String hql = "FROM Socio S WHERE S.nombreYapellido = \'"+nombre+"\'";
		Query query = session.createQuery(hql);
		resultados = (T) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		}else {
			session.getTransaction().commit();
			session.close();
		}
		return resultados;
	}
	
	@Override
	public void save(T entidad) throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		if(entidad != null) {
		session.save(entidad);
		session.getTransaction().commit();
		session.close();
		}else {
			session.getTransaction().commit();
			session.close();
		}
	}
	
	@Override
	public void delete(String nombre) throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		T entidad = this.getByName(nombre);
		if(entidad != null) {
			session.delete(entidad);
			session.getTransaction().commit();
			session.close();
		}else {
			session.getTransaction().commit();
			session.close();
		}
	}
	
	@Override
	public void update(T entidad) throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		if(entidad != null) {
		session.update(entidad);
		session.getTransaction().commit();
		session.close();
		}else {
			session.getTransaction().commit();
			session.close();
		}
	}

/*		
	@SuppressWarnings("unchecked")
	public List<T> getAll() throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(type);	
		List<T> resultados = cr.list();
		session.getTransaction().commit();
		session.close();
		return resultados;
	}
	@SuppressWarnings("unchecked")
	public List<T> getByName(String nombre) throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(type);
		cr.add(Restrictions.ilike("nombreYapellido", nombre));
		List<T> resultados = cr.list();
		session.getTransaction().commit();
		session.close();
		return resultados;
	}
	

	
	@Override
	public boolean delete(T entidad) throws PersistenceException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.delete(entidad);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	@Override
	public int count() throws PersistenceException {
		// TODO Auto-generated method stub
		return this.getAll().size();
	}
*/	
	
}
