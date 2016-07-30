package br.com.petshop.DAO;
import java.util.List;

import br.com.petshop.modelo.Animal;

public interface AnimalDAO {

		public void insere (Animal animal);
		public void remove (Integer id);
		public Animal busca (Integer id);
		public List<Animal> buscarTodos();
}
