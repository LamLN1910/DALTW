package com.tpt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tpt.connection.DBConnection;
import com.tpt.util.mapAttributeSQL;

import com.tpt.dao.IQuanHuyenDao;
import com.tpt.model.HuyenModel;

public class QuanhuyenDaoImpl extends DBConnection implements IQuanHuyenDao {
	
	Connection connection = null;
	PreparedStatement pStatement = null;
	ResultSet rSet = null;
	
	@Override
	public List<HuyenModel> getAll() {
		// TODO Auto-generated method stub
		
			String sql = "select * from quanhuyen";
			List<HuyenModel> huyens = new ArrayList<HuyenModel>();
			
			try
			{
				connection = super.getConnection();
				pStatement = connection.prepareStatement(sql);
				rSet = pStatement.executeQuery();
				mapAttributeSQL mapHuyen = new mapAttributeSQL();
				while (rSet.next())
				{
					HuyenModel huyen = mapHuyen.mapHuyen(rSet);
					huyens.add(huyen);
				}
				return huyens;
			} catch (Exception e)
			{
				// TODO: handle exception
			}
			return null;
		
	}

	@Override
	public List<HuyenModel> getByTinh(int id_t) {
		
		String sql = "select * from quanhuyen where tinhthanhphoid = ?";
		List<HuyenModel> huyens = new ArrayList<HuyenModel>();
		try
		{
			connection = super.getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id_t);
			rSet = pStatement.executeQuery();
			mapAttributeSQL mapHuyen = new mapAttributeSQL();
			while (rSet.next())
			{
				HuyenModel huyen = mapHuyen.mapHuyen(rSet);
				huyens.add(huyen);
			}
			return huyens;
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public HuyenModel getHuyen(int id)
	{
		String sql = "select * from quanhuyen where id = ?";
		try
		{
			connection = super.getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id);
			rSet = pStatement.executeQuery();
			mapAttributeSQL mapHuyen = new mapAttributeSQL();
			while (rSet.next())
			{
				return mapHuyen.mapHuyen(rSet);
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}
}
