package br.com.petshop.DAOImpl;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import br.com.petshop.DAO.AnimalDAO;
import br.com.petshop.modelo.Animal;
import br.com.petshop.util.ConnectionFactory;
import br.com.petshop.util.SQL;
import br.com.petshop.util.Util;

public abstract class AnimalDAOImpl implements AnimalDAO {

	private Connection con;
	
	public AnimalDAOImpl(){
		this.con = new ConnectionFactory().getConnection();
	}
	
	public void insere (Animal animal){
		try {
	PreparedStatement stmt = (PreparedStatement) con.prepareStatement(SQL.INSERT_ANIMAL);
			
			stmt.setString(1, animal.getNome());
			stmt.setInt(2, animal.getId_Dono());
			stmt.setInt(3, animal.getId_Tipo_Animal());
		
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			Util.trataErro(Util.MSG_ERRO_DAO_0003, e);
		}
	}
}







