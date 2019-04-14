package com.curso.domain;

import java.io.Serializable;

public class ItemPedido implements Serializable {

	// Atributos Basicos
	private static final long serialVersionUID = 1L;
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	// Associacoes
	
	// Construtores
	public ItemPedido() {}

	public ItemPedido(Double desconto, Integer quantidade, Double preco) {
		super();
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Getters and Setters
	public Double getDesconto() {
		return this.desconto;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	// HashCode e Equals ??

}
