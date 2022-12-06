package com.tpt.dao;

import java.util.List;

import com.tpt.model.TinhModel;

public interface ITinhDao {
	
	public List<TinhModel> getAll();
	public TinhModel getTinh(int id);
}
