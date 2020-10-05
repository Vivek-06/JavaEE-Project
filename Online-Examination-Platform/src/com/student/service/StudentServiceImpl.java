package com.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dbConnect.dbConnect;
import com.student.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	private dbConnect conn;
	private PreparedStatement ps;
	private Connection connectdb;

	@Override
	public void registerStudent(Student st) {
		try {
			
			connectdb = conn.dbConn();
			String sql = "insert into student_database values (?,?,?,?,?,?,?)";
			
			ps = connectdb.prepareStatement(sql);
			ps.setInt(1, st.getId());
			ps.setString(2, st.getName());
			ps.setString(3, st.getCourse());
			ps.setString(4, st.getDepartment());
			ps.setString(5, st.getEmail());
			ps.setString(6, st.getPassword());
			ps.setString(7, st.getRepassword());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Student> displayStudent() {
		List<Student> stList = new ArrayList<Student>();

		try {
			connectdb = conn.dbConn();
			String sql = "select * from student";
			Statement st = connectdb.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				stList.add(new Student(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5)
				));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stList;
	}

}
