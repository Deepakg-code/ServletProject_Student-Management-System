package com.jsp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display-all-students")
public class DisplayAllStudentsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");


			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_student-management-system", "root", "deepak");
			PreparedStatement pst = conn.prepareStatement("SELECT * from student");

			ResultSet rs = pst.executeQuery();

			req.setAttribute("resultSet", rs);
			RequestDispatcher rd	= req.getRequestDispatcher("DisplayAllStudents.jsp");
			rd.forward(req, resp);



		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
