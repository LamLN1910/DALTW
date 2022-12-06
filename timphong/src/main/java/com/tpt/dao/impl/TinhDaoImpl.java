package com.tpt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tpt.connection.DBConnection;
import com.tpt.dao.ITinhDao;
import com.tpt.model.TinhModel;
import com.tpt.util.mapAttributeSQL;


public class TinhDaoImpl extends DBConnection implements ITinhDao {

	@Override
	public List<TinhModel> getAll() {
		
			String sql = "select id, tentinhthanhpho from tinhthanhpho order by tentinhthanhpho";
			List<TinhModel> tinhs = new ArrayList<TinhModel>();
			
			try
			{
				Connection connection = super.getConnection();
				PreparedStatement pStatement = connection.prepareStatement(sql);
				ResultSet rSet = pStatement.executeQuery();
				mapAttributeSQL mapTinh = new mapAttributeSQL();
				while (rSet.next())
				{
					TinhModel tinh = mapTinh.mapTinh(rSet);
					tinhs.add(tinh);
				}
				return tinhs;
			} catch (Exception e)
			{
				// TODO: handle exception
			}
			return null;
		
	}
	@Override
	public TinhModel getTinh(int id)
	{
		String sql = "select id, tentinhthanhpho from tinhthanhpho where id=?";
		
		try
		{
			Connection connection = super.getConnection();
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id);
			ResultSet rSet = pStatement.executeQuery();
			mapAttributeSQL mapTinh = new mapAttributeSQL();
			while (rSet.next())
			{
				return mapTinh.mapTinh(rSet);
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return null;
	}

}
