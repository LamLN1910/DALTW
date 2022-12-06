package com.tpt.dao;

import java.util.List;

import com.tpt.model.DathenModel;

public interface IDathenDao
{

	boolean editDathen(DathenModel dathen);

	boolean deleteDathen(int id_dh, int id_tk, int id_p);

	boolean insertDathen(DathenModel dathen);

	List<DathenModel> findByTrangthai(int id_tk, int tt);

	DathenModel findDathen(int id_dh, int id_tk, int id_p);

	List<DathenModel> findBySeller(int id_tk, int tt);

	List<DathenModel> findAll(int tt);
	
	
}
