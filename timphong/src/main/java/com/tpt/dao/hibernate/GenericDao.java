package com.tpt.dao.hibernate;

public interface GenericDao<E> {
	public E create(E e);
	public E delete(E e);
	public E update(E e);
	public E select(int id);
}
