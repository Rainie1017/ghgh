package com.qdu.service;

import java.util.List;

import com.qdu.pojo.Clazz;
import com.qdu.pojo.Student;

public interface ClazzService {
 
	public void insertClazz(Clazz clazz);
	
	public Clazz selectClazzByAll(String clazzName, String teacherMobile, int currentYear);
	
	public void updateClazzOfCourseId(int clazzId, int courseId);
	
	public List<Clazz> selectClazzByCourse(int courseId);
	
	public List<Clazz> clazzListByClazzId(int courseId);
	
	public void updateClazzByCourseId(int clazzId);
	
	}
