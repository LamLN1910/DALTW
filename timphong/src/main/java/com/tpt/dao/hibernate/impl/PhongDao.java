package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Phong;

public class PhongDao extends JpaDao<Phong> implements GenericDao<Phong> {

	@Override
	public Phong create(Phong e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Phong delete(Phong e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Phong update(Phong e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Phong select(int id) {
		// TODO Auto-generated method stub
		return super.select(Phong.class, id);
	}

}
