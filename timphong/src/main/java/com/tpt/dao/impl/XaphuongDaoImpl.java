package com.tpt.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tpt.connection.DBConnection;
import com.tpt.util.mapAttributeSQL;
import com.tpt.dao.IXaphuongDao;
import com.tpt.model.XaModel;

public class XaphuongDaoImpl extends DBConnection implements IXaphuongDao {

	Connection connection = null;
	PreparedStatement pStatement = null;
	ResultSet rSet = null;
	
	@Override
	public List<XaModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<XaModel> getByQuanhuyen(int id_h) {
		
		String sql = "select * from xaphuong where quanhuyenid = ?";
		List<XaModel> xas = new ArrayList<XaModel>();
		try
		{
			connection = super.getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id_h);
			rSet = pStatement.executeQuery();
			mapAttributeSQL mapXa = new mapAttributeSQL();
			while (rSet.next())
			{
				XaModel xa = mapXa.mapXa(rSet);
				xas.add(xa);
			}
			return xas;
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public XaModel getXa(int id)
	{
		String sql = "select * from xaphuong where id = ?";
		try
		{
			connection = super.getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id);
			rSet = pStatement.executeQuery();
			mapAttributeSQL mapXa = new mapAttributeSQL();
			while (rSet.next())
			{
				return mapXa.mapXa(rSet);
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
//	public static void main(String[] args)
//	{
//		IXaphuongDao xaphuongDao = new XaphuongDaoImpl();
//		System.out.println(xaphuongDao.getXa(2439).getHuyen().getTinh().getTentinh());
//	}
}
