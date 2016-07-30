package br.com.petshop.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL = "jdbc:mysql//localhost/petshop";
	private static final String USER = "root";
	private static final String PASS = "";
	
	private final Util util = new Util();
	
		public Connection getConnection(){
			Connection con = null;
			try {
				con=DriverManager.getConnection(URL, USER, PASS);
				System.out.println("Conexão realizada!");
			} catch (SQLException e) {
				System.out.println("Conexão não realizada!");
			} catch(Exception e){
				System.out.println("Erro ao tentar criar uma nova conexão!");
			}
			return con;
	}
}
