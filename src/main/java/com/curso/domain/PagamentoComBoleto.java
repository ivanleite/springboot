package com.curso.domain;

import java.util.Date;

public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public Date getDataVencimento() {
		return this.dataVencimento;
	}
	public Date getDataPagamento() {
		return this.dataPagamento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	

}
