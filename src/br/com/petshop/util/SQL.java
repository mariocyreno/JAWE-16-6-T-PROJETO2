package br.com.petshop.util;

public class SQL {
	public static final String
		INSERT_ANIMAL = "INSERT INTO animal (nome,idDono, idTipoAnimal) VALUES (?,?,?)";
	
	public static final String
	INSERT_PESSOA = "INSERT INTO pessoa (nome,cpf, telefone, emai) VALUES (?,?,?,?)";
	
	public static final String
	INSERT_TIPOANIMAL = "INSERT INTO tipoanimal (tipoanimalid, tipo) VALUES (?,?)";
}
