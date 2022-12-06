package com.tpt.model;

import java.util.List;

public class LoaiphongModel
{
	private int id_lp;
	private String tenloai;
	List<PhongModel> phongs;
	public LoaiphongModel()
	{
	}
	public LoaiphongModel(int id_lp, String tenloai, List<PhongModel> phongs)
	{
		super();
		this.id_lp = id_lp;
		this.tenloai = tenloai;
		this.phongs = phongs;
	}
	public int getId_lp()
	{
		return id_lp;
	}
	public void setId_lp(int id_lp)
	{
		this.id_lp = id_lp;
	}
	public String getTenloai()
	{
		return tenloai;
	}
	public void setTenloai(String tenloai)
	{
		this.tenloai = tenloai;
	}
	public List<PhongModel> getPhongs()
	{
		return phongs;
	}
	public void setPhongs(List<PhongModel> phongs)
	{
		this.phongs = phongs;
	}
	
	
}
