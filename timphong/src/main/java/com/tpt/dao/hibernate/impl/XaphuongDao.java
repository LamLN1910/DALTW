package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Xaphuong;

public class XaphuongDao extends JpaDao<Xaphuong> implements GenericDao<Xaphuong> {

	@Override
	public Xaphuong create(Xaphuong e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Xaphuong delete(Xaphuong e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Xaphuong update(Xaphuong e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Xaphuong select(int id) {
		// TODO Auto-generated method stub
		return super.select(Xaphuong.class, id);
	}

}
