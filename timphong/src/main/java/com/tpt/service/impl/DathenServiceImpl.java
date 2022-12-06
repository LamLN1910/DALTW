package com.tpt.service.impl;

import java.util.List;

import com.tpt.dao.IDathenDao;
import com.tpt.dao.impl.DathenDaoImpl;
import com.tpt.model.DathenModel;
import com.tpt.service.IDathenService;

public class DathenServiceImpl implements IDathenService
{
	IDathenDao dathenDao = new DathenDaoImpl();

	@Override
	public boolean editDathen(DathenModel dathen)
	{
		// TODO Auto-generated method stub
		return dathenDao.editDathen(dathen);
	}

	@Override
	public boolean deleteDathen(int id_dh, int id_tk, int id_p)
	{
		// TODO Auto-generated method stub
		return dathenDao.deleteDathen(id_dh, id_tk, id_p);
	}

	@Override
	public boolean insertDathen(DathenModel dathen)
	{
		// TODO Auto-generated method stub
		return dathenDao.insertDathen(dathen);
	}
	
	@Override
	public List<DathenModel> findByTrangthai(int id_tk, int tt)
	{
		return dathenDao.findByTrangthai(id_tk, tt);
	}

	@Override
	public DathenModel findDathen(int id_dh, int id_tk, int id_p)
	{
		// TODO Auto-generated method stub
		return dathenDao.findDathen(id_dh, id_tk, id_p);
	}

	@Override
	public List<DathenModel> findBySeller(int id_tk, int tt)
	{
		// TODO Auto-generated method stub
		return dathenDao.findBySeller(id_tk, tt);
	}

	@Override
	public List<DathenModel> findAll(int tt)
	{
		return dathenDao.findAll(tt);
	}
}
