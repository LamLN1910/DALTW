package com.tpt.util;

import java.sql.ResultSet;

import com.tpt.dao.IHinhanhDao;
import com.tpt.dao.ILoaiphongDao;
import com.tpt.dao.IPhongDao;
import com.tpt.dao.IQuanHuyenDao;
import com.tpt.dao.ITaikhoanDao;
import com.tpt.dao.ITinhDao;
import com.tpt.dao.IXaphuongDao;
import com.tpt.dao.impl.HinhanhDaoImpl;
import com.tpt.dao.impl.LoaiphongDaoImpl;
import com.tpt.dao.impl.PhongDaoImpl;
import com.tpt.dao.impl.QuanhuyenDaoImpl;
import com.tpt.dao.impl.TaikhoanDaoImpl;
import com.tpt.dao.impl.TinhDaoImpl;
import com.tpt.dao.impl.XaphuongDaoImpl;
import com.tpt.model.DanhgiaModel;
import com.tpt.model.DathenModel;
import com.tpt.model.HuyenModel;
import com.tpt.model.LoaiphongModel;
import com.tpt.model.PhongModel;
import com.tpt.model.TaikhoanModel;
import com.tpt.model.TheodoiModel;
import com.tpt.model.TinhModel;
import com.tpt.model.XaModel;

public class mapAttributeSQL
{
	public mapAttributeSQL()
	{
	}
	
	public DanhgiaModel mapDanhgia(ResultSet rSet)
	{
		DanhgiaModel danhgia = new DanhgiaModel();
		ITaikhoanDao taikhoanDao = new TaikhoanDaoImpl();
		try
		{
			int id_p = rSet.getInt("id_p");
			int id_tk = rSet.getInt("id_tk");
			danhgia.setId_dg(rSet.getInt("id_dg"));
			danhgia.setId_p(id_p);
			danhgia.setId_tk(id_tk);
			danhgia.setNgay(rSet.getDate("ngay"));
			danhgia.setSosao(rSet.getInt("sosao"));
			danhgia.setNoidung(rSet.getString("noidung"));
			danhgia.setTaikhoan(taikhoanDao.getTaikhoan(id_tk));
			return danhgia;
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
	
	public PhongModel mapPhong(ResultSet rSet)
	{
		ILoaiphongDao loaiphongDao = new LoaiphongDaoImpl();
		IHinhanhDao hinhanhDao = new HinhanhDaoImpl();
		IXaphuongDao xaphuongDao = new XaphuongDaoImpl();
		ITaikhoanDao taikhoanDao = new TaikhoanDaoImpl();
		PhongModel phong = new PhongModel();
		try
		{
			int id_lp = rSet.getInt("id_lp");
			int id_p = rSet.getInt("id_p");
			phong.setId_p(id_p);
			phong.setTen(rSet.getString("ten"));
			phong.setAnhchinh(rSet.getString("anhchinh"));
			phong.setTrangthai(rSet.getInt("trangthai"));
			phong.setChieudai(rSet.getFloat("chieudai"));
			phong.setChieurong(rSet.getFloat("chieurong"));
			phong.setGia(rSet.getInt("gia"));
			phong.setSonguoi(rSet.getInt("songuoi"));
			phong.setDcchitiet(rSet.getString("dcchitiet"));
			phong.setMota(rSet.getString("mota"));
			phong.setId_lp(id_lp);
			phong.setId_tk(rSet.getInt("id_tk"));
			phong.setMaxa(rSet.getInt("id_x"));
			phong.setNgaydang(rSet.getDate("ngaydang"));
			XaModel xa = xaphuongDao.getXa(phong.getMaxa());
			TaikhoanModel taikhoan = taikhoanDao.getTaikhoan(phong.getId_tk());
			phong.setTaikhoan(taikhoan);
			phong.setXa(xa);
			phong.setLoaiphong(loaiphongDao.getLoaiphong(id_lp));
			phong.setHinhanhs(hinhanhDao.getHinhanhP(id_p));
			
			return phong;
		} catch (Exception e)
		{
		}
		return null;
	}
	
	public TaikhoanModel mapTaikhoan(ResultSet rSet)
	{
		TaikhoanModel taikhoan = new TaikhoanModel();
		try
		{
			taikhoan.setAnhdaidien(rSet.getString("anhdaidien"));
			taikhoan.setId_tk(rSet.getInt("id_tk"));
			taikhoan.setTentk(rSet.getString("tentk"));
			taikhoan.setMatkhau(rSet.getString("matkhau"));
			taikhoan.setQuyen(rSet.getInt("quyen"));
			taikhoan.setEmail(rSet.getString("email"));
			taikhoan.setSdt(rSet.getString("sdt"));
			taikhoan.setHo(rSet.getString("ho"));
			taikhoan.setTen(rSet.getString("ten"));
			return taikhoan;
		} catch (Exception e)
		{
			return null;
		}
	}
	
	public LoaiphongModel mapLoaiphong(ResultSet rSet)
	{
		LoaiphongModel loaiphong = new LoaiphongModel();
		try
		{
			int id_lp = rSet.getInt("id_lp");
			loaiphong.setId_lp(id_lp);
			loaiphong.setTenloai(rSet.getString("tenloai"));
			return loaiphong;
		} catch (Exception e)
		{
		}
		return null;
	}
	
	public TheodoiModel mapTheodoi(ResultSet rSet)
	{
		TheodoiModel theodoi = new TheodoiModel();
		try
		{
			theodoi.setId_dc(rSet.getInt("id_dc"));
			theodoi.setId_td(rSet.getInt("id_td"));
			return theodoi;
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
	
	public TinhModel mapTinh(ResultSet rSet)
	{
		TinhModel tinh = new TinhModel();
		try
		{
			tinh.setMatinh(rSet.getInt("ID"));
			tinh.setTentinh(rSet.getString("tentinhthanhpho"));
			return tinh;
		} catch (Exception e)
		{
		}
		return null;
	}
	
	public HuyenModel mapHuyen(ResultSet rSet)
	{
		ITinhDao tinhDao = new TinhDaoImpl();
		HuyenModel huyen = new HuyenModel();
		try
		{
			huyen.setMahuyen(rSet.getInt("ID"));
			huyen.setTenhuyen(rSet.getString("tenquanhuyen"));
			huyen.setMatinh(rSet.getInt("tinhThanhPhoId"));
			TinhModel tinh = tinhDao.getTinh(huyen.getMatinh());
			huyen.setTinh(tinh);
			return huyen;
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
	
	public XaModel mapXa(ResultSet rSet)
	{
		IQuanHuyenDao quanHuyenDao = new QuanhuyenDaoImpl();
		XaModel xa = new XaModel();
		try
		{
			xa.setMaxa(rSet.getInt("ID"));
			xa.setTenxa(rSet.getString("tenxaphuong"));
			xa.setMahuyen(rSet.getInt("quanHuyenId"));
			HuyenModel huyen = quanHuyenDao.getHuyen(xa.getMahuyen());
			xa.setHuyen(huyen);
			return xa;
		} catch (Exception e)
		{
		}
		return null;
	}
	
	public DathenModel mapDathen(ResultSet rSet)
	{
		DathenModel dathen = new DathenModel();
		try
		{
			int id_p = rSet.getInt("id_p");
			int id_tk = rSet.getInt("id_tk");
			dathen.setId_dh(rSet.getInt("id_dh"));
			dathen.setId_tk(id_tk);
			dathen.setId_p(id_p);
			dathen.setTrangthai(rSet.getInt("trangthai"));
			dathen.setNgay(rSet.getDate("ngay"));
			dathen.setGio(rSet.getTime("gio"));
			IPhongDao phongDao = new PhongDaoImpl();
			ITaikhoanDao taikhoanDao = new TaikhoanDaoImpl();
			dathen.setPhong(phongDao.getPhong(id_p));
			dathen.setNguoidat(taikhoanDao.getTaikhoan(id_tk));
			return dathen;
		} catch (Exception e)
		{
		}
		return null;
	}
}
