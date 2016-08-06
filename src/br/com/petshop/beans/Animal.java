package br.com.petshop.beans;

public class Animal {
	private Integer id;
	private String Nome;
	private Integer idDono;
	private Integer idTipoAnimal;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getId_Dono() {
		return idDono;
	}
	public void setId_Dono(Integer id_Dono) {
		this.idDono = id_Dono;
	}
	public Integer getId_Tipo_Animal() {
		return idTipoAnimal;
	}
	public void setId_Tipo_Animal(Integer id_Tipo_Animal) {
		this.idTipoAnimal = id_Tipo_Animal;
	}
	
	
}
