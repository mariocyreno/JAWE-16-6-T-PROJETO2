package br.com.petshop.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Util {
	

	public static String MSG_ERRO_DAO_0003;

	public static void trataErro(String mensagem,Exception ex){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
		System.err.println(dateFormat.format(System.currentTimeMillis())+mensagem+ex.toString());
	}
}
