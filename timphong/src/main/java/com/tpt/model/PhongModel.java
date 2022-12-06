package com.tpt.model;

import java.sql.Date;
import java.util.List;

public class PhongModel
{
	private int id_p;
	private String ten;
	private String anhchinh;
	private int trangthai; // 0 Ẩn, 1 Hiện
	private float chieudai;
	private float chieurong;
	private int gia;
	private int songuoi; // 1 2 4 8 >10
	private String dcchitiet;
	private String mota;
	private Date ngaydang;
	private int id_lp;
	private int maxa;
	private int id_tk;
	private int quantam;
	private float danhgia;
	private LoaiphongModel loaiphong;
	private XaModel xa;
	private TaikhoanModel taikhoan;
	private List<TaikhoanModel> ngdatPhongs;
	private List<HinhanhModel> hinhanhs;
	public PhongModel()
	{
	}
	public PhongModel(int id_p, String ten, String anhchinh, int trangthai, float chieudai, float chieurong, int gia,
			int songuoi, String dcchitiet, String mota, Date ngaydang, int id_lp, int maxa, int id_tk, int quantam,
			float danhgia, LoaiphongModel loaiphong, XaModel xa, TaikhoanModel taikhoan, List<TaikhoanModel> ngdatPhongs,
			List<HinhanhModel> hinhanhs)
	{
		super();
		this.id_p = id_p;
		this.ten = ten;
		this.anhchinh = anhchinh;
		this.trangthai = trangthai;
		this.chieudai = chieudai;
		this.chieurong = chieurong;
		this.gia = gia;
		this.songuoi = songuoi;
		this.dcchitiet = dcchitiet;
		this.mota = mota;
		this.ngaydang = ngaydang;
		this.id_lp = id_lp;
		this.maxa = maxa;
		this.id_tk = id_tk;
		this.quantam = quantam;
		this.danhgia = danhgia;
		this.loaiphong = loaiphong;
		this.xa = xa;
		this.taikhoan = taikhoan;
		this.ngdatPhongs = ngdatPhongs;
		this.hinhanhs = hinhanhs;
	}
	public int getId_p()
	{
		return id_p;
	}
	public void setId_p(int id_p)
	{
		this.id_p = id_p;
	}
	public String getTen()
	{
		return ten;
	}
	public void setTen(String ten)
	{
		this.ten = ten;
	}
	public String getAnhchinh()
	{
		return anhchinh;
	}
	public void setAnhchinh(String anhchinh)
	{
		this.anhchinh = anhchinh;
	}
	public int getTrangthai()
	{
		return trangthai;
	}
	public void setTrangthai(int trangthai)
	{
		this.trangthai = trangthai;
	}
	public float getChieudai()
	{
		return chieudai;
	}
	public void setChieudai(float chieudai)
	{
		this.chieudai = chieudai;
	}
	public float getChieurong()
	{
		return chieurong;
	}
	public void setChieurong(float chieurong)
	{
		this.chieurong = chieurong;
	}
	public int getGia()
	{
		return gia;
	}
	public void setGia(int gia)
	{
		this.gia = gia;
	}
	public int getSonguoi()
	{
		return songuoi;
	}
	public void setSonguoi(int songuoi)
	{
		this.songuoi = songuoi;
	}
	public String getDcchitiet()
	{
		return dcchitiet;
	}
	public void setDcchitiet(String dcchitiet)
	{
		this.dcchitiet = dcchitiet;
	}
	public String getMota()
	{
		return mota;
	}
	public void setMota(String mota)
	{
		this.mota = mota;
	}
	public Date getNgaydang()
	{
		return ngaydang;
	}
	public void setNgaydang(Date ngaydang)
	{
		this.ngaydang = ngaydang;
	}
	public int getId_lp()
	{
		return id_lp;
	}
	public void setId_lp(int id_lp)
	{
		this.id_lp = id_lp;
	}
	public int getMaxa()
	{
		return maxa;
	}
	public void setMaxa(int maxa)
	{
		this.maxa = maxa;
	}
	public int getId_tk()
	{
		return id_tk;
	}
	public void setId_tk(int id_tk)
	{
		this.id_tk = id_tk;
	}
	public int getQuantam()
	{
		return quantam;
	}
	public void setQuantam(int quantam)
	{
		this.quantam = quantam;
	}
	public float getDanhgia()
	{
		return danhgia;
	}
	public void setDanhgia(float danhgia)
	{
		this.danhgia = danhgia;
	}
	public LoaiphongModel getLoaiphong()
	{
		return loaiphong;
	}
	public void setLoaiphong(LoaiphongModel loaiphong)
	{
		this.loaiphong = loaiphong;
	}
	public XaModel getXa()
	{
		return xa;
	}
	public void setXa(XaModel xa)
	{
		this.xa = xa;
	}
	public TaikhoanModel getTaikhoan()
	{
		return taikhoan;
	}
	public void setTaikhoan(TaikhoanModel taikhoan)
	{
		this.taikhoan = taikhoan;
	}
	public List<TaikhoanModel> getNgdatPhongs()
	{
		return ngdatPhongs;
	}
	public void setNgdatPhongs(List<TaikhoanModel> ngdatPhongs)
	{
		this.ngdatPhongs = ngdatPhongs;
	}
	public List<HinhanhModel> getHinhanhs()
	{
		return hinhanhs;
	}
	public void setHinhanhs(List<HinhanhModel> hinhanhs)
	{
		this.hinhanhs = hinhanhs;
	}
	
}
