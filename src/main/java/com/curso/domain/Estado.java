package com.curso.domain;

import java.io.Serializable;

public class Estado implements Serializable {

	// Atributos Basicos
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	// Associacoes

	// Construtores
	public Estado() {}

	public Estado(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	// Getters e Setters
	public Integer getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		Estado other = (Estado) obj;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}
	
	

}
