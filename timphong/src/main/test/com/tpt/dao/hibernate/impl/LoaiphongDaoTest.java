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
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testDeleteLoaiphong() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testUpdateLoaiphong() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testSelectInt() {
		Loaiphong loaiphong = loaiphongDao.select(4);
		System.out.print(loaiphong.getTenloai());
		assertTrue(loaiphong.getIdLp()>0);
		fail("Not yet implemented"); // TODO
	}

}
