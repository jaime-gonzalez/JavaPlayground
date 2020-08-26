package br.com.recording.files;

public class Produto {

	private String nome;
	private int saldoEstoque;
	private int estoqueSeguranca;
	private int pontoReposicao;
	private int loteMinimo;

	public Produto(String nome, int saldoEstoque, int estoqueSeguranca, int pontoReposicao, int loteMinimo) {
		this.nome = nome;
		this.saldoEstoque = saldoEstoque;
		this.estoqueSeguranca = estoqueSeguranca;
		this.pontoReposicao = pontoReposicao;
		this.loteMinimo = loteMinimo;
	}

	public Produto() {

	}

	public int getEstoqueSeguranca() {
		return estoqueSeguranca;
	}

	public void setEstoqueSeguranca(int estoqueSeguranca) {
		this.estoqueSeguranca = estoqueSeguranca;
	}

	public int getPontoReposicao() {
		return pontoReposicao;
	}

	public void setPontoReposicao(int pontoReposicao) {
		if (pontoReposicao >= 0) {
			this.pontoReposicao = pontoReposicao;
		}
	}

	public int getLoteMinimo() {
		return loteMinimo;
	}

	public void setLoteMinimo(int loteMinimo) {
		if (loteMinimo >= 0) {
			this.loteMinimo = loteMinimo;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != "") {
			this.nome = nome;
		}
	}

	public int getSaldoEstoque() {
		return saldoEstoque;
	}

	public void setSaldoEstoque(int saldoEstoque) {
		if (saldoEstoque > 0) {
			this.saldoEstoque = saldoEstoque;
		}
	}
}
