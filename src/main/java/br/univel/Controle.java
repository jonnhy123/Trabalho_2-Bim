package br.univel;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Controle {


	public void salveSerializable(int id, int numero, String nome, String endereco,
			String	complemento, String bairro, String cidade, String estado, String cep,
			String telefone,String celular ){
		/*
		 * Criamos o objeto Address na memória e setamos os valores
		 * de seus atributos
		 * */
		
		Cliente c = new Cliente();
		c.setId(id);
		c.setNumero(numero);
		c.setNome(nome);
		c.setEndereco(endereco);
		c.setComplemento(complemento);
		c.setBairro(bairro);
		c.setCidade(cidade);
		c.setEstado(estado);
		c.setCep(cep);
		c.setTelefone(telefone);
		c.setCelular(celular);
		
		try{
			/*
			 * A Classe FileOutputStream é responsável por criar
			 * o arquivo fisicamente no disco, assim poderemos realizar a 
			 * escrita neste. 
			 * */
			FileOutputStream fout = new FileOutputStream("C:/Users/User-01/Desktop/MyFile/File.txt");
			/*
			 * A Classe ObjectOutputStream escreve os objetos no FileOutputStream
			 * */
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			/*
			 * Veja aqui a mágica ocorrendo: Estamos gravando um objeto 
			 * do tipo Address no arquivo address.ser. Atenção: O nosso 
			 * objeto Address que está sendo gravado, já é gravado de forma 
			 * serializada
			 * */
			oos.writeObject(c);
			oos.close();
			System.out.println("File Salved");
		   }catch(Exception ex){
			   ex.printStackTrace();
		   } 		
	}
	
}
