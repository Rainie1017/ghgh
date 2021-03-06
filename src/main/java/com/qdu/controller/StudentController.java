package com.qdu.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.qdu.pojo.Student;
import com.qdu.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	private StudentService studentServiceImpl;

	// 学生登录准备
	@RequestMapping(value = "/forStudentLogin.do")
	public String selectStudentByNo() {
		return "studentLogin";
	}

	// 学生登录
	@RequestMapping(value = "/studentLogin.do")
	public String studentLogin(HttpServletRequest request, ModelMap map) {
		String studentRoNo = request.getParameter("studentRoNo");
		String password = request.getParameter("studentPassword");
		Student student = studentServiceImpl.selectStudentByNo(studentRoNo);
		if(student != null){
			if(password.equals(student.getStudentPassword())){
				map.addAttribute("student", student);
				// session的id存一下
				request.getSession().setAttribute("studentId", studentRoNo);
				return "index";
			}
		}
		return "failer";
	}

	// 学生等待审核
	@RequestMapping(value = "/waitForRegister.do")
	public String waitForRegister() {
		return "waitForRegister";
	}
	
	//通过clazz找student
	@RequestMapping(value = "/selectStudentByClazzId.do")
	public String selectStudentByClazzId(int clazzId,ModelMap map){
		List<Student> students = studentServiceImpl.selectStudentByClazzId(clazzId);
		map.put("student", students);
		return "studentInfo";
	}

	// 查找临时表学生信息
	@RequestMapping(value = "/selectStudentTemById.do")
	public String selectStudentTemById(ModelMap map, HttpServletRequest request) {
		String rono = request.getParameter("studentRoNo");
		Student student = studentServiceImpl.selectStudentByNo(rono);
		if (student != null) {
			map.addAttribute("student", student);
			return "showInfo";
		} else
			return "failer";
	}

	// 跳转到新建学生页面
	@RequestMapping(value = "/addStudent.do")
	public String addStudent(ModelMap map) {
		return "addStudent";
	}

	// ajax添加学生
	@RequestMapping(value = "/insertStudent.do", method = RequestMethod.POST)
	public String insertTemporary(HttpServletRequest request, @RequestParam("file") MultipartFile file, ModelMap map,
			Student student) {
		String path = request.getSession().getServletContext().getRealPath("/") + "studentPhoto";
		System.out.println(path);
		String fileName = file.getOriginalFilename();
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// 保存 
		try {
			file.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		studentServiceImpl.insertStudentByNo(student);
		System.out.println("学生注册成功");
		return "waitForRegister";
	}

}
