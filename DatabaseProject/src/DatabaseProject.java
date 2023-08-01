import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseProject db = new DatabaseProject();
		db.createConnection();
	}
	
	void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM USER");
			while(rs.next()) {
				String name = rs.getString("username");
				Integer passw = rs.getInt("password");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.printf("NAME: %s, PASSWORD: %d, EMAIL: %s, PHONE: %s\n",name, passw, email, phone);
			}
			System.out.println("Database success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
