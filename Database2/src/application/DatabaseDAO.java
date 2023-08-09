package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entities.User;

public class DatabaseDAO {
	private String url = "jdbc:mysql://localhost;3306/userdb";
	private String dbName = "root";
	private String password = "";
	private String driver = "com.mysql.cj.jdbc.Driver";
	//Class.forName(com.mysql.cj.jdbc.Driver);
	
	public void loadDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, dbName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	public String insert(User user) {
		loadDriver(driver);
		Connection con = getConnection();
		
		String result = "Data entered successfully";
		String query =  "INSERT INTO USER VALUES(?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Error! data not inserted successfully";
		}
		
		return result;
	}
}
