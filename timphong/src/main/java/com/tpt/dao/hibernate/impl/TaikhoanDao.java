package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Taikhoan;

public class TaikhoanDao extends JpaDao<Taikhoan> implements GenericDao<Taikhoan> {

	@Override
	public Taikhoan create(Taikhoan e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}

	@Override
	public Taikhoan delete(Taikhoan e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Taikhoan update(Taikhoan e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Taikhoan select(int id) {
		// TODO Auto-generated method stub
		return super.select(Taikhoan.class, id);
	}

}
