package com.tpt.dao;

import java.util.List;

import com.tpt.model.PhongModel;

public interface IPhongDao
{
	public PhongModel getPhong(int id_p);
	public List<PhongModel> getPhongSeller(int id_tk);
	public boolean insertPhong(PhongModel phong);
	public boolean deletePhong(int id_p);
	public boolean editPhong(PhongModel newPhong);
	public List<PhongModel> getPhongLoaiphong(int id_lp);
	
	public List<PhongModel> get9Phong();
	public List<PhongModel> pagingPhong(int index, String keyword, int loc[], String thutu, int isSeller);
	public List<PhongModel> getAll();
	public int getIdPhong(String anhchinh);
	
	public List<PhongModel> searchPhong(String keyword, String thutu, int isSeller);
	public boolean sellerUpdatePhong(PhongModel phong);
	List<PhongModel> locPhong(String keyword, int loc[], String thutu, int isSeller);
}
