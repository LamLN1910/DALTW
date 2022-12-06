package com.tpt.model;

import java.util.List;

public class HuyenModel
{
	private int mahuyen;
	private String tenhuyen;
	private int matinh;
	TinhModel tinh;
	List<XaModel> xas;
	public HuyenModel()
	{
	}
	public HuyenModel(int mahuyen, String tenhuyen, int matinh, TinhModel tinh, List<XaModel> xas)
	{
		super();
		this.mahuyen = mahuyen;
		this.tenhuyen = tenhuyen;
		this.matinh = matinh;
		this.tinh = tinh;
		this.xas = xas;
	}
	public int getMahuyen()
	{
		return mahuyen;
	}
	public void setMahuyen(int mahuyen)
	{
		this.mahuyen = mahuyen;
	}
	public String getTenhuyen()
	{
		return tenhuyen;
	}
	public void setTenhuyen(String tenhuyen)
	{
		this.tenhuyen = tenhuyen;
	}
	public int getMatinh()
	{
		return matinh;
	}
	public void setMatinh(int matinh)
	{
		this.matinh = matinh;
	}
	public TinhModel getTinh()
	{
		return tinh;
	}
	public void setTinh(TinhModel tinh)
	{
		this.tinh = tinh;
	}
	public List<XaModel> getXas()
	{
		return xas;
	}
	public void setXas(List<XaModel> xas)
	{
		this.xas = xas;
	}
	
}
