package com.tpt.service;

import java.util.List;

import com.tpt.model.HuyenModel;

public interface IQuanhuyenService {
	
	public List<HuyenModel> getAll();
	public List<HuyenModel> getByTinh(int id_t);
}
