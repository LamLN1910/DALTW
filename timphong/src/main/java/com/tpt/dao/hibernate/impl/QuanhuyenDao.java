package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Quanhuyen;

public class QuanhuyenDao extends JpaDao<Quanhuyen> implements GenericDao<Quanhuyen> {

	@Override
	public Quanhuyen create(Quanhuyen e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Quanhuyen delete(Quanhuyen e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Quanhuyen update(Quanhuyen e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Quanhuyen select(int id) {
		// TODO Auto-generated method stub
		return super.select(Quanhuyen.class, id);
	}

}
