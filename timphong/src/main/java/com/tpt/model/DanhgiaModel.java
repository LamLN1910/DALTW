package com.tpt.model;

import java.sql.Date;

public class DanhgiaModel
{
	private int id_dg;
	private int id_p;
	private int id_tk;
	private Date ngay;
	private float sosao;
	private String noidung;
	private TaikhoanModel taikhoan;
	private PhongModel phong;
	public DanhgiaModel()
	{
		// TODO Auto-generated constructor stub
	}
	public DanhgiaModel(int id_dg, int id_p, int id_tk, Date ngay, float sosao, String noidung, TaikhoanModel taikhoan,
			PhongModel phong)
	{
		super();
		this.id_dg = id_dg;
		this.id_p = id_p;
		this.id_tk = id_tk;
		this.ngay = ngay;
		this.sosao = sosao;
		this.noidung = noidung;
		this.taikhoan = taikhoan;
		this.phong = phong;
	}
	public int getId_dg()
	{
		return id_dg;
	}
	public void setId_dg(int id_dg)
	{
		this.id_dg = id_dg;
	}
	public int getId_p()
	{
		return id_p;
	}
	public void setId_p(int id_p)
	{
		this.id_p = id_p;
	}
	public int getId_tk()
	{
		return id_tk;
	}
	public void setId_tk(int id_tk)
	{
		this.id_tk = id_tk;
	}
	public Date getNgay()
	{
		return ngay;
	}
	public void setNgay(Date ngay)
	{
		this.ngay = ngay;
	}
	public float getSosao()
	{
		return sosao;
	}
	public void setSosao(float sosao)
	{
		this.sosao = sosao;
	}
	public String getNoidung()
	{
		return noidung;
	}
	public void setNoidung(String noidung)
	{
		this.noidung = noidung;
	}
	public TaikhoanModel getTaikhoan()
	{
		return taikhoan;
	}
	public void setTaikhoan(TaikhoanModel taikhoan)
	{
		this.taikhoan = taikhoan;
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
