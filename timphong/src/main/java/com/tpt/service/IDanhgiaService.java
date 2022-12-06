package com.tpt.service;

import java.util.List;

import com.tpt.model.DanhgiaModel;

public interface IDanhgiaService
{
	boolean editDanhgia();

	boolean deleteDanhgia(int id_p, int id_tk, int id_dg);

	boolean insertDanhgia(DanhgiaModel danhgia);

	List<DanhgiaModel> findById_p(int id_p);
}
