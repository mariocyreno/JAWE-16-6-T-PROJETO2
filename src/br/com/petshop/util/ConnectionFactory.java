package br.com.petshop.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

		public Connection getConnection(){
			Connection con = null;
				try {
					con = DriverManager.getConnection ("jdbc:mysql://localhost/patshop", "root", "");
					System.out.println("Conex�o Realizada com Sucesso");
					
				} catch (SQLException e) {
					System.err.println("Conex�o n�o realizada");
				}
					
			return con;	
				
			}
}
