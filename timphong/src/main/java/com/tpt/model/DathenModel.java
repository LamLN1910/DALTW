package com.tpt.model;

import java.sql.Date;
import java.sql.Time;

public class DathenModel
{
	private int id_dh;
	private int id_tk;
	private int id_p;
	private int trangthai;
	private Date ngay;
	private Time gio;
	private TaikhoanModel nguoidat;
	private PhongModel phong;
	public DathenModel()
	{
	}
	public DathenModel(int id_dh, int id_tk, int id_p, int trangthai, Date ngay, Time gio, TaikhoanModel nguoidat, PhongModel phong)
	{
		super();
		this.id_dh = id_dh;
		this.id_tk = id_tk;
		this.id_p = id_p;
		this.trangthai = trangthai;
		this.ngay = ngay;
		this.gio = gio;
		this.nguoidat = nguoidat;
		this.phong = phong;
	}
	public int getId_dh()
	{
		return id_dh;
	}
	public void setId_dh(int id_dh)
	{
		this.id_dh = id_dh;
	}
	public int getId_tk()
	{
		return id_tk;
	}
	public void setId_tk(int id_tk)
	{
		this.id_tk = id_tk;
	}
	public int getId_p()
	{
		return id_p;
	}
	public void setId_p(int id_p)
	{
		this.id_p = id_p;
	}
	public int getTrangthai()
	{
		return trangthai;
	}
	public void setTrangthai(int trangthai)
	{
		this.trangthai = trangthai;
	}
	public Date getNgay()
	{
		return ngay;
	}
	public void setNgay(Date ngay)
	{
		this.ngay = ngay;
	}
	public Time getGio()
	{
		return gio;
	}
	public void setGio(Time gio)
	{
		this.gio = gio;
	}
	public TaikhoanModel getNguoidat()
	{
		return nguoidat;
	}
	public void setNguoidat(TaikhoanModel nguoidat)
	{
		this.nguoidat = nguoidat;
	}
	public PhongModel getPhong()
	{
		return phong;
	}
	public void setPhong(PhongModel phong)
	{
		this.phong = phong;
	}
	
}
