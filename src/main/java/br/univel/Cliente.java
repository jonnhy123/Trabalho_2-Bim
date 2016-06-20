package br.univel;

import java.io.Serializable;


public class Cliente implements Serializable{

	private int id, numero;
	private String nome, endereco, complemento, bairro, cidade, estado, cep, telefone, celular;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep2) {
		this.cep = cep2;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
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