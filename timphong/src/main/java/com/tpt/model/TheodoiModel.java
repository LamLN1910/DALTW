package com.tpt.model;

public class TheodoiModel
{
	private int id_dc;
	private int id_td;
	private TaikhoanModel nguoiTheodoi;
	private TaikhoanModel duocTheodoi;
	public TheodoiModel()
	{
	}
	public TheodoiModel(int id_dc, int id_td, TaikhoanModel nguoiTheodoi, TaikhoanModel duocTheodoi)
	{
		super();
		this.id_dc = id_dc;
		this.id_td = id_td;
		this.nguoiTheodoi = nguoiTheodoi;
		this.duocTheodoi = duocTheodoi;
	}
	public int getId_dc()
	{
		return id_dc;
	}
	public void setId_dc(int id_dc)
	{
		this.id_dc = id_dc;
	}
	public int getId_td()
	{
		return id_td;
	}
	public void setId_td(int id_td)
	{
		this.id_td = id_td;
	}
	public TaikhoanModel getNguoiTheodoi()
	{
		return nguoiTheodoi;
	}
	public void setNguoiTheodoi(TaikhoanModel nguoiTheodoi)
	{
		this.nguoiTheodoi = nguoiTheodoi;
	}
	public TaikhoanModel getDuocTheodoi()
	{
		return duocTheodoi;
	}
	public void setDuocTheodoi(TaikhoanModel duocTheodoi)
	{
		this.duocTheodoi = duocTheodoi;
	}
	
	
}
