package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Hinhanh;

public class HinhanhDao extends JpaDao<Hinhanh> implements GenericDao<Hinhanh> {

	@Override
	public Hinhanh create(Hinhanh e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Hinhanh delete(Hinhanh e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Hinhanh update(Hinhanh e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Hinhanh select(int id) {
		// TODO Auto-generated method stub
		return super.select(Hinhanh.class, id);
	}

}
