package com.curso.domain;

import java.io.Serializable;

public class Endereco implements Serializable {

	// Atributos Basicos
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	// Associacoes
	
	// Construtores
	public Endereco() {}

	public Endereco(Integer id, String logradouro, String numero, String complemento, String bairro, String cep) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

	// Getters e Setters
	public Integer getId() {
		return this.id;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public String getBairro() {
		return this.bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	// HashCode e Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}
	
	

}
