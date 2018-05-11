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
			//1、加载配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			//2、创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//3、创建SqlSession对象
			sqlSession = sqlSessionFactory.openSession();
			//4、相关操作：增删改查
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
