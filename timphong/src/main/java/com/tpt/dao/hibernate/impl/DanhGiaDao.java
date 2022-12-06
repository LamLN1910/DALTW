package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Danhgia;

public class DanhGiaDao extends JpaDao<Danhgia> implements GenericDao<Danhgia> {

	@Override
	public Danhgia create(Danhgia e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Danhgia delete(Danhgia e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Danhgia update(Danhgia e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Danhgia select(int id) {
		// TODO Auto-generated method stub
		return super.select(Danhgia.class, id);
	}

}
