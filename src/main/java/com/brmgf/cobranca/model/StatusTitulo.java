package com.brmgf.cobranca.model;

public enum StatusTitulo {
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private String descricaoStatus;
	
	StatusTitulo(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}
	
	public String getDescricaoStatus() {
		return descricaoStatus;
	}
}
