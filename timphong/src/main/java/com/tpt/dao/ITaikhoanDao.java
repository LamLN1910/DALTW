package com.tpt.dao;

import java.util.List;

import com.tpt.model.TaikhoanModel;

public interface ITaikhoanDao
{
	public List<TaikhoanModel> getAll();
	public List<TaikhoanModel> getAllUser();
	public List<TaikhoanModel> getAllSeller();
	public TaikhoanModel getTaikhoan(int id_tk);
	public boolean insertTaikhoan(TaikhoanModel taikhoan);
	public boolean deleteTaikhoan(int id_tk);
	public boolean editTaikhoan(TaikhoanModel taikhoan);
	public TaikhoanModel dangNhap(TaikhoanModel taikhoan);
}
