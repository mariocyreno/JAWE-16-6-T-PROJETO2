package br.com.petshop.DAOImpl;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import br.com.petshop.DAO.TipoAnimalDAO;
import br.com.petshop.beans.TipoAnimal;
import br.com.petshop.util.ConnectionFactory;
import br.com.petshop.util.SQL;
import br.com.petshop.util.Util;

public abstract class TipoAnimalDAOImpl implements TipoAnimalDAO {
private Connection con;
	
	public TipoAnimalDAOImpl(){
		this.con = new ConnectionFactory().getConnection();
	}
	
	public void insere (TipoAnimal tipoanimal){
		try {
	PreparedStatement stmt = (PreparedStatement) con.prepareStatement(SQL.INSERT_ANIMAL);
			
			stmt.setInt(1, tipoanimal.getTipoAnimalid());
			stmt.setString(2, tipoanimal.getTipo());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			Util.trataErro(Util.MSG_ERRO_DAO_0003, e);
		}
	}
}
