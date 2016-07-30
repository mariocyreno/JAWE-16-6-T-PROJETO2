package br.com.petshop.teste;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.petshop.util.ConnectionFactory;

public class TestaConnection {
	public static void main (String args[]){
		try {
			Connection connection = new ConnectionFactory().getConnection();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
}
