package br.com.petshop.DAO;
import java.util.List;
import br.com.petshop.modelo.Pessoa;

public interface PessoaDAO {

		public void insere (Pessoa pessoa);
		public void remove (Integer id);
		public Pessoa busca (Integer id);
		public List<Pessoa> buscarTodos();
}
