package com.tpt.dao;

import java.util.List;

import com.tpt.model.LoaiphongModel;

public interface ILoaiphongDao
{
	public List<LoaiphongModel> getAll();
	public LoaiphongModel getLoaiphong(int id_lp);
	public boolean insertLoaiphong(LoaiphongModel lp);
	public boolean deleteLoaiphong(int id_lp);
	public boolean editLoaiphong(LoaiphongModel lp);
}
