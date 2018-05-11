package com.school.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.school.beans.Student;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;
	@Override
	public void insertStu(Student student) {
		try {
			//1�����������ļ�
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			//2������SqlSessionFactory����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//3������SqlSession����
			sqlSession = sqlSessionFactory.openSession();
			//4����ز�������ɾ�Ĳ�
			sqlSession.insert("insertStudent", student);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
