package com.curso.domain;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {

	// Atributos Basicos
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date instante;
	
	// Associacoes
	
	// Construtores
	public Pedido() {}

	public Pedido(Integer id, Date instante) {
		super();
		this.id = id;
		this.instante = instante;
	}

	// Getters e Setters
	public Integer getId() {
		return this.id;
	}

	public Date getInstante() {
		return this.instante;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
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
		Pedido other = (Pedido) obj;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}
	

}
