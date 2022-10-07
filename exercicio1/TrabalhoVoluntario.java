package br.com.prova.av1;

public class TrabalhoVoluntario extends Projeto{
	
	public String tipoTrabalho;
	public int duracaoTrabalho;
	public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim,
			String tipoTrabalho, int duracaoTrabalho) {
		super(nomeProjeto, descricao, endereco, datainicio, datafim);
		this.tipoTrabalho = tipoTrabalho;
		this.duracaoTrabalho = duracaoTrabalho;
	}
	public String getTipoTrabalho() {
		return tipoTrabalho;
	}
	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}
	public int getDuracaoTrabalho() {
		return duracaoTrabalho;
	}
	public void setDuracaoTrabalho(int duracaoTrabalho) {
		this.duracaoTrabalho = duracaoTrabalho;
	}
	
	public boolean validarProjeto() {
		
		if (this.duracaoTrabalho < 2) {
			return true;
		}
		
		else return false;
	}

}
