package com.curso.domain;

import java.io.Serializable;

public class Produto implements Serializable {
	
	// atributos basicos
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Double preco;

	// associacoes
	
	// construtores
	public Produto() {}
	
	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	// getters and setters
	public Integer getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	// hashcode e equals
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
		Produto other = (Produto) obj;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}
	
	
}
