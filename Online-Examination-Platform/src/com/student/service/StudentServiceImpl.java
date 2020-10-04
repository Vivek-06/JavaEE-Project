package com.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dbConnect.dbConnect;
import com.student.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	private dbConnect conn;

	@Override
	public void registerStudent(Student st) {
		try {
			Connection connectdb = conn.dbConn();
			String sql = "insert into student_database values (?,?,?,?,?,?,?)";
			
			PreparedStatement ps = connectdb.prepareStatement(sql);
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

}
