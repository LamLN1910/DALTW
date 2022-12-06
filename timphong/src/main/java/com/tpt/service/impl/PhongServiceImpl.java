package com.tpt.service.impl;

import java.io.File;
import java.util.List;

import com.tpt.dao.IHinhanhDao;
import com.tpt.dao.IPhongDao;
import com.tpt.dao.impl.HinhanhDaoImpl;
import com.tpt.dao.impl.PhongDaoImpl;
import com.tpt.model.HinhanhModel;
import com.tpt.model.PhongModel;
import com.tpt.service.IPhongService;
import com.tpt.util.Constant;

public class PhongServiceImpl implements IPhongService
{
	IHinhanhDao hinhanhDao = new HinhanhDaoImpl();
	IPhongDao phongDao = new PhongDaoImpl();
	@Override
	public List<PhongModel> getPhongSeller(int id_tk)
	{
		return phongDao.getPhongSeller(id_tk);
	}
	@Override
	public List<PhongModel> getPhongLoaiphong(int id_lp)
	{
		return phongDao.getPhongLoaiphong(id_lp);
	}
	@Override
	public PhongModel getPhong(int id_p)
	{
		return phongDao.getPhong(id_p);
	}
	@Override
	public boolean editPhong(PhongModel newPhong, String newHinhanhs[], boolean type)
	{
		PhongModel oldPhong = phongDao.getPhong(newPhong.getId_p());
		if(newPhong.getMaxa() == 0)
		{
			newPhong.setMaxa(oldPhong.getMaxa());
		}
		for(int i = 0; i < Constant.SoHinh; i++)
		{
			if(newHinhanhs[i] == null)
			{
				newHinhanhs[i] = ".";
			}
		}
		int chk = newHinhanhs[0].lastIndexOf(".");
		boolean chkDelete = false;
		if(newHinhanhs[0].substring(chk+1).length() != 0)
		{
			newPhong.setAnhchinh(newHinhanhs[0]);
			chkDelete = true;
		}
		else 
		{
			newPhong.setAnhchinh(oldPhong.getAnhchinh());
		}
		
		for(int i = 1; i < Constant.SoHinh; i++)
		{
			int kt = newHinhanhs[i].lastIndexOf(".");
			if(newHinhanhs[i].substring(kt+1).length() != 0)
			{
				int stt = i - 1;
				if(stt < oldPhong.getHinhanhs().size())
				{
					String oldHinhanh = oldPhong.getHinhanhs().get(stt).getHinhanh();
					if(hinhanhDao.editHinhanh(newHinhanhs[i], oldHinhanh))
					{	
						deleteHinhanh(oldHinhanh);
					}
				}
			}
		}
		boolean check;
		if(type == true)
		{
			check = phongDao.editPhong(newPhong);
		}
		else 
		{
			check = phongDao.sellerUpdatePhong(newPhong);
		}
		if(check == true && chkDelete == true)
		{
			deleteHinhanh(oldPhong.getAnhchinh());
		}
		return check;
	}
	
	@Override
	public boolean insertPhong(PhongModel phong, String hinhanhs[])
	{
		
		boolean check = phongDao.insertPhong(phong);
		if(check)
		{
			HinhanhModel ha = new HinhanhModel();
			int id_p = phongDao.getIdPhong(phong.getAnhchinh());
			ha.setId_p(id_p);
			for(int i = 1; i < Constant.SoHinh; i++)
			{
				int kt = hinhanhs[i].lastIndexOf(".");
				if(hinhanhs[i].substring(kt+1).length() != 0)
				{
					ha.setHinhanh(hinhanhs[i]);
					hinhanhDao.insertHinhanh(ha);
				}
			}
		}
		else 
		{
			for(String hinhanh : hinhanhs)
			{
				deleteHinhanh(hinhanh);
			}
		}
		return check;
	}
	public boolean deletePhong(int id_p)
	{
		PhongModel phong = phongDao.getPhong(id_p);
		for(HinhanhModel ha : phong.getHinhanhs())
		{
			deleteHinhanh(ha.getHinhanh());
		}
		deleteHinhanh(phong.getAnhchinh());
		if(phongDao.deletePhong(id_p) == true && hinhanhDao.deleteHinhanhP(id_p) == true)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public List<PhongModel> get9Phong()
	{
		return phongDao.get9Phong();
	}
	
	@Override
	public List<PhongModel> pagingPhong(int index, String keyword, int loc[], String thutu, int isSeller)
	{
		return phongDao.pagingPhong(index, keyword, loc, thutu, isSeller);
	}
	
	@Override
	public List<PhongModel> getAll() {
		return phongDao.getAll();
	}
	boolean deleteHinhanh(String filename)
	{
		String filePath = Constant.DIR + "/phong/" + filename;
		File file = new File(filePath);
		if(file.exists())
		{
			file.delete();
			return true;
		}
		return false;
	}
	@Override
	public List<PhongModel> searchPhong(String keyword, String thutu, int isSeller)
	{
		// TODO Auto-generated method stub
		return phongDao.searchPhong(keyword, thutu, isSeller);
	}
	@Override
	public List<PhongModel> locPhong(String keyword, int[] loc, String thutu, int isSeller)
	{
		// TODO Auto-generated method stub
		return phongDao.locPhong(keyword, loc, thutu, isSeller);
	}
}
