package model;

public class Materiais {

	private String patrimonio;
	private String descricao;
	private String fabricante;
	private String localidade;
	private int qtdade;
	
	
	public Materiais(String patrimonio, String descricao, String fabricante, String localidade, int qtdade) {
		this.patrimonio = patrimonio;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.localidade = localidade;
		this.qtdade = qtdade;
	}
	
	
	public Materiais() {
		
	}
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
		
	public String getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public int getQtdade() {
		return qtdade;
	}
	public void setQtdade(int qtdade) {
		this.qtdade = qtdade;
	}
	
	
}
