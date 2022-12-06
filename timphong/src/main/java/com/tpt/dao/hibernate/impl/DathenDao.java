package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Dathen;

public class DathenDao extends JpaDao<Dathen> implements GenericDao<Dathen> {

	@Override
	public Dathen create(Dathen e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Dathen delete(Dathen e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Dathen update(Dathen e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Dathen select(int id) {
		// TODO Auto-generated method stub
		return super.select(Dathen.class, id);
	}

	
}
