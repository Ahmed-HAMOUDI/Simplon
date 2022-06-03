import java.sql.*;

public class Connect {
public Connection con;
	
	public Connect() {}
	
	public Connection connect() {
		
		try {

			return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/condidat", "postgres", "00000");
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
