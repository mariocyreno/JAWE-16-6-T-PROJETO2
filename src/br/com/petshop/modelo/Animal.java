package br.com.petshop.modelo;

public class Animal {
	private Integer id;
	private String Nome;
	private Integer id_Dono;
	private Integer id_Tipo_Animal;
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
		return id_Dono;
	}
	public void setId_Dono(Integer id_Dono) {
		this.id_Dono = id_Dono;
	}
	public Integer getId_Tipo_Animal() {
		return id_Tipo_Animal;
	}
	public void setId_Tipo_Animal(Integer id_Tipo_Animal) {
		this.id_Tipo_Animal = id_Tipo_Animal;
	}
	
	
}
