package com.tpt.service;

import java.util.List;

import com.tpt.model.PhongModel;

public interface IPhongService
{
	public List<PhongModel> getPhongSeller(int id_tk);
	public List<PhongModel> getPhongLoaiphong(int id_lp);
	public PhongModel getPhong(int id_p);
	public boolean editPhong(PhongModel newPhong, String hinhanhs[], boolean type);
	public boolean insertPhong(PhongModel phong, String hinhanhs[]);
	public boolean deletePhong(int id_p);
	
	public List<PhongModel> get9Phong();
	public List<PhongModel> pagingPhong(int index, String keyword, int loc[], String thutu, int isSeller);
	public List<PhongModel> getAll();
	
	public List<PhongModel> searchPhong(String keyword, String thutu, int isSeller);
	
	public List<PhongModel> locPhong(String keyword, int loc[], String thutu, int isSeller);


}
