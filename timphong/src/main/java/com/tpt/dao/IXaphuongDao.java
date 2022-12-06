package com.tpt.dao;

import java.util.List;

import com.tpt.model.XaModel;

public interface IXaphuongDao {
	
	public List<XaModel> getAll();
	public List<XaModel> getByQuanhuyen(int id_h);
	public XaModel getXa(int id);
}
