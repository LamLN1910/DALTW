package com.tpt.dao.hibernate.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.tpt.model.hibernate.Loaiphong;

class LoaiphongDaoTest {

	private static LoaiphongDao loaiphongDao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		loaiphongDao = new LoaiphongDao();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		loaiphongDao.close();
	}

	@Test
	final void testCreateLoaiphong() {
		Loaiphong loaiphong= new Loaiphong();
		loaiphong.setTenloai("test");
		loaiphong = loaiphongDao.create(loaiphong);
		assertTrue(loaiphong.getIdLp()>0);
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testDeleteLoaiphong() {
		Loaiphong loaiphong= new Loaiphong();
		loaiphong.setIdLp(8);
		loaiphong = loaiphongDao.delete(loaiphong);
		assertTrue(loaiphong == null);
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testUpdateLoaiphong() {
		Loaiphong loaiphong= new Loaiphong();
		loaiphong.setIdLp(7);
		loaiphong.setTenloai("nhà bình dân");
		loaiphong = loaiphongDao.update(loaiphong);
		assertTrue(loaiphong.getTenloai().equals("nhà bình dân"));
		fail("Not yet implemented"); // TODO
	}

}
