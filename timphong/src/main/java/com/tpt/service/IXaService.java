package com.tpt.service;

import java.util.List;

import com.tpt.model.XaModel;

public interface IXaService {
	
	public List<XaModel> getAll();
	public List<XaModel> getByQuanhuyen(int id_h);
	
}
