package ar.com.softtek.academia.backend.dao;

import java.util.List;

import ar.com.academia.exceptions.PersistenceException;

public interface IGenericDAO<T> {
	
	public List<T> getAll() throws PersistenceException;

	public T getByName(String name) throws PersistenceException;

	public void save(T entidad) throws PersistenceException;

	public void update(T entidad) throws PersistenceException;

//	public boolean delete(T entidad) throws PersistenceException;

	public void delete(String nombre) throws PersistenceException;

//	public int count() throws PersistenceException;

}
