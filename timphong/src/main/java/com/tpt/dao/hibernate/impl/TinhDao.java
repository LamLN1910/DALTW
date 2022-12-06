package com.tpt.dao.hibernate.impl;

import com.tpt.dao.hibernate.GenericDao;
import com.tpt.model.hibernate.Tinhthanhpho;

public class TinhDao extends JpaDao<Tinhthanhpho> implements GenericDao<Tinhthanhpho> {
	@Override
	public Tinhthanhpho create(Tinhthanhpho e) {
		// TODO Auto-generated method stub
		return super.create(e);
	}
	
	@Override
	public Tinhthanhpho delete(Tinhthanhpho e) {
		// TODO Auto-generated method stub
		return super.delete(e);
	}

	@Override
	public Tinhthanhpho update(Tinhthanhpho e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}

	@Override
	public Tinhthanhpho select(int id) {
		// TODO Auto-generated method stub
		return super.select(Tinhthanhpho.class, id);
	}
}
