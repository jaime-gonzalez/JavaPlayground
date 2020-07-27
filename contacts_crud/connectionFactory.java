package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/cadastro";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "jvbn42.klpo19";
	
	public static Connection CreateConnectionToMySQL() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection con = CreateConnectionToMySQL();
		
		if (con!=null) {
			System.out.println("Conexão Estabelecida!");
			con.close();
		}
	}

}
