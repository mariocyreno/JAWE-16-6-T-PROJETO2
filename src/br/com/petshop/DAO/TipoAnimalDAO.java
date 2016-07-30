package br.com.petshop.DAO;
import java.util.List;
import br.com.petshop.modelo.TipoAnimal;

public interface TipoAnimalDAO {


	public void insere (TipoAnimal tipoanimal);
	public void remove (Integer id);
	public TipoAnimal busca (Integer id);
	public List<TipoAnimal> buscarTodos();
}
