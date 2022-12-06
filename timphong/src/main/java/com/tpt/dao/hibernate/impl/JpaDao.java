package com.tpt.dao.hibernate.impl;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDao<E> {
	private static EntityManagerFactory entityManagerFactory;

	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("HibernateTimphong");
	}

	public JpaDao() {
	}

	public E create(E entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.flush();
			entityManager.refresh(entity);
			entityManager.getTransaction().commit();
			entityManager.close();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public E delete(E entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(entityManager.contains(entity)?entity:entityManager.merge(entity));
			entityManager.getTransaction().commit();
			entityManager.close();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public E update(E entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(entity);
			//entityManager.flush();
			//entityManager.refresh(entity);
			entityManager.getTransaction().commit();
			entityManager.close();
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public E select(Class<E> classE, int id) {
		E entity = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entity = entityManager.find(classE, id);
			entityManager.flush();
			entityManager.refresh(entity);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entity;
	}

	public void close() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}
