package com.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.entity.Student;
import com.student.service.StudentService;

/**
 * Servlet implementation class StudentRegister
 */
@WebServlet(urlPatterns = "/studentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Student student;
	private StudentService studentService;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		String department = request.getParameter("department");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		
		System.out.println(id);
		
		student = new Student(id, name, course, department, email, password, repassword);
		studentService.registerStudent(student);

		student.toString();
		
		request.setAttribute("students", studentService.displayStudent());
		request.getRequestDispatcher("/WEB_INF/view/Student-Details-Display.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("students", studentService.displayStudent());
		request.getRequestDispatcher("/WEB_INF/view/Student-Details-Display.jsp").forward(request, response);
		
	}

}
