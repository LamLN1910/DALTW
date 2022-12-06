package com.tpt.service.impl;

import java.util.List;

import com.tpt.dao.ITinhDao;
import com.tpt.dao.impl.TinhDaoImpl;
import com.tpt.model.TinhModel;
import com.tpt.service.ITinhService;


public class TinhServiceImpl implements ITinhService {

	ITinhDao tinhDao = new TinhDaoImpl();
	@Override
	public List<TinhModel> getAll()
	{
		return tinhDao.getAll();
	}
	
}
