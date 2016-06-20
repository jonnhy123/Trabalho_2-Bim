package br.univel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "Cliente")
public class Cliente implements Serializable{

	private int id, numero;
	private String nome, endereco, complemento, bairro, cidade, estado, cep, telefone, celular;

	@XmlElement(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name = "numero")
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@XmlElement(name = "nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@XmlElement(name = "endereco")
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@XmlElement(name = "complemento")
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@XmlElement(name = "bairro")
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@XmlElement(name = "cidade")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@XmlElement(name = "estado")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@XmlElement(name = "cep")
	public String getCep() {
		return cep;
	}
	public void setCep(String cep2) {
		this.cep = cep2;
	}
	@XmlElement(name = "telefone")
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@XmlElement(name = "celular")
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String toString(){
		return "Bairro = " + this.bairro + " Celular = " + this.celular 
				+ " Cep = " + this.cep + " Cidade = " + this.cidade 
				+ " Complemento" + this.complemento
				+ " Endereço = " + this.endereco + " Estado = " + this.estado 
				+ " Id = " + this.id + " Nome = " + this.nome
				+ " Número = " + this.numero + " Telefone = " + this.telefone;
	}

}