import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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