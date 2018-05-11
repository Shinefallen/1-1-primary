package com.school.test;

import org.junit.Before;
import org.junit.Test;

import com.school.beans.Student;
import com.school.dao.IStudentDao;
import com.school.dao.StudentDaoImpl;

public class MyTest {
	private IStudentDao dao;

	@Before
	public void before() {
		dao = new StudentDaoImpl();
	}
	
	@Test
	public void testInsert() {
		Student student = new Student("Âí¿¡·å",22,91.8);
		dao.insertStu(student);
	}
}
