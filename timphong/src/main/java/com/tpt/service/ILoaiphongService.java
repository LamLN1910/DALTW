package com.tpt.service;

import java.util.List;

import com.tpt.model.LoaiphongModel;

public interface ILoaiphongService
{
	public boolean insertLoaiphong(LoaiphongModel lp);
	public List<LoaiphongModel> getAll();
	public LoaiphongModel getLoaiphong(int id_lp);
	public boolean deleteLoaiphong(int id_lp);
	public boolean editLoaiphong(LoaiphongModel lp);
}
