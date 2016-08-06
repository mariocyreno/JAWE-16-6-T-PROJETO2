package br.com.petshop.DAOImpl;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import br.com.petshop.DAO.PessoaDAO;
import br.com.petshop.modelo.Pessoa;
import br.com.petshop.util.ConnectionFactory;
import br.com.petshop.util.SQL;
import br.com.petshop.util.Util;

public abstract class PessoaDAOImpl implements PessoaDAO {
private Connection con;
	
	public PessoaDAOImpl(){
		this.con = new ConnectionFactory().getConnection();
	}
	
	public void insere (Pessoa pessoa){
		try {
	PreparedStatement stmt = (PreparedStatement) con.prepareStatement(SQL.INSERT_ANIMAL);
			
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getCpf());
			stmt.setString(3, pessoa.getTelefone());
			stmt.setString(4, pessoa.getEmail());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			Util.trataErro(Util.MSG_ERRO_DAO_0003, e);
		}
	}
}

