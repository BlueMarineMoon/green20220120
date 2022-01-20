package org.comstudy21.saram.test;

import java.util.List;

import org.comstudy21.saram.model.SaramDao;
import org.comstudy21.saram.model.SaramDto;

public class SaramDaoTest {

	public static void main(String[] args) {
		// testSaramSelectAll();
		// setSelectOne();
		// testInsert();
		// testUpdate();
		// testDelete();
		// testselectById();
		testselectByName();
	}

	private static void testselectByName() {
		List<SaramDto> list = SaramDao.selectByName(new SaramDto(0, null, "Gyuyoung", 0));
		for (SaramDto saram : list) {
			System.out.println(saram);
		}
	}

	private static void testselectById() {
		SaramDto saram = SaramDao.selectById(new SaramDto(0, "PARK", null, 0));
		System.out.println(saram.toString());
	}

	private static void testDelete() {
		SaramDto dto = new SaramDto(1, null, null, 0);
		SaramDao.delete(dto);
		testSaramSelectAll();
	}

	private static void testUpdate() {
		SaramDto dto = new SaramDto(3, "PARK", "Gyuyoung", 25);
		SaramDao.update(dto);
		testSaramSelectAll();
	}

	private static void testInsert() {
		SaramDao.insert(new SaramDto(0, "test1", "name1", 15));
	}

	private static void setSelectOne() {
		SaramDto saram = SaramDao.selectOne(new SaramDto(1, null, null, 0));
		System.out.println(saram.toString());
	}

	private static void testSaramSelectAll() {
		List<SaramDto> list = SaramDao.selectAll();
		for (SaramDto saram : list) {
			System.out.println(saram);
		}
	}

}
