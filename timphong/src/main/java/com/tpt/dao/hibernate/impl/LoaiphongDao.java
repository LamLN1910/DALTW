package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Loaiphong;

public class LoaiphongDao extends JpaDao<Loaiphong> implements GenericDao<Loaiphong> {

	@Override
	public Loaiphong create(Loaiphong e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}
	
	@Override
	public Loaiphong delete(Loaiphong e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Loaiphong update(Loaiphong e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Loaiphong select(int id) {
		// TODO Auto-generated method stub
		return super.select(Loaiphong.class, id);
	}
}
