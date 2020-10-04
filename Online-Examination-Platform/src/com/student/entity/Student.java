package com.student.entity;

public class Student {
	private int id;
	private String name;
	private String course;
	private String department;
	private String email;
	private String password;
	private String repassword;
	
	public Student() {
		
	}

	public Student(int id, String name, String course, String department, String email, String password,
			String repassword) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.department = department;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", department=" + department + ", email="
				+ email + ", password=" + password + ", repassword=" + repassword + "]";
	}
	
	

}
