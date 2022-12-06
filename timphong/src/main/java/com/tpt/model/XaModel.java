package com.tpt.model;

public class XaModel
{
	private int maxa;
	private String tenxa;
	private int mahuyen;
	private HuyenModel huyen;
	public XaModel()
	{
	}
	public XaModel(int maxa, String tenxa, int mahuyen, HuyenModel huyen)
	{
		super();
		this.maxa = maxa;
		this.tenxa = tenxa;
		this.mahuyen = mahuyen;
		this.huyen = huyen;
	}
	public int getMaxa()
	{
		return maxa;
	}
	public void setMaxa(int maxa)
	{
		this.maxa = maxa;
	}
	public String getTenxa()
	{
		return tenxa;
	}
	public void setTenxa(String tenxa)
	{
		this.tenxa = tenxa;
	}
	public int getMahuyen()
	{
		return mahuyen;
	}
	public void setMahuyen(int mahuyen)
	{
		this.mahuyen = mahuyen;
	}
	public HuyenModel getHuyen()
	{
		return huyen;
	}
	public void setHuyen(HuyenModel huyen)
	{
		this.huyen = huyen;
	}
	
}
