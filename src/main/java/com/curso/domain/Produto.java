package com.curso.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Produto implements Serializable {
	
	// atributos basicos
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double preco;
	
	//Este relacionamento é muito para muitos, significa que uma nova tabela é criada para
	//Armazenar as chaves estrangeiras das duas tabelas envolvidas.
	@JsonBackReference //Para evitar referencia ciclica
	@ManyToMany
	@JoinTable(
				name="PRODUTO_CATEGORIA", 
				joinColumns=@JoinColumn(name="produto_id"), 
				inverseJoinColumns=@JoinColumn(name="categoria_id")
			)
	private List<Categoria> categorias = new ArrayList<>();

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

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
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
