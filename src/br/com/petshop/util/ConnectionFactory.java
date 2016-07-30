package br.com.petshop.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

		public Connection getConnection(){
			Connection con = null;
				try {
					con = DriverManager.getConnection ("jdbc:mysql://localhost/patshop", "root", "");
					System.out.println("Conexão Realizada com Sucesso");
					
				} catch (SQLException e) {
					System.err.println("Conexão não realizada");
				}
					
			return con;	
				
			}
}
