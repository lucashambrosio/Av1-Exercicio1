package br.com.prova.av1;

public class Projeto {
	
	protected String nomeProjeto;
	protected String descricao;
	protected String endereco;
	protected String datainicio;
	protected String datafim;
	public Projeto(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim) {
		super();
		this.nomeProjeto = nomeProjeto;
		this.descricao = descricao;
		this.endereco = endereco;
		this.datainicio = datainicio;
		this.datafim = datafim;
	}
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	public String getDatafim() {
		return datafim;
	}
	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}

}
