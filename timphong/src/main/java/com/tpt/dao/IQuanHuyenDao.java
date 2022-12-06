package com.tpt.dao;

import java.util.List;

import com.tpt.model.HuyenModel;

public interface IQuanHuyenDao {

	public List<HuyenModel> getAll();
	public List<HuyenModel> getByTinh(int id_t);
	public HuyenModel getHuyen(int id);
}
