package br.com.arquivos.gravacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainProduto {

	static final Integer ESTOQUE_MINIMO = 10;

	public static void main(String[] args) throws IOException {

		ArrayList<String> linhas = new ArrayList<String>();

		Produto produto = new Produto();

		produto.setNome(JOptionPane.showInputDialog("Informe o nome do Produto"));

		produto.setSaldoEstoque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em saldo")));

		produto.setEstoqueSeguranca(Integer.parseInt(JOptionPane.showInputDialog("Informe o estoque de segurança")));

		produto.setPontoReposicao(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ponto de Reposição")));

		produto.setLoteMinimo(Integer.parseInt(JOptionPane.showInputDialog("Informe o Lote Mínimo")));

		linhas.add(produto.getNome() + "," + produto.getSaldoEstoque() + "," + produto.getEstoqueSeguranca() + ","
				+ produto.getPontoReposicao() + "," + produto.getLoteMinimo());

		Path baseCadastro = Paths.get("C:/Users/Jaime.DEV/Desktop/Java/baseCadastro.csv");
		Files.write(baseCadastro, linhas, StandardOpenOption.APPEND);

	}
}
