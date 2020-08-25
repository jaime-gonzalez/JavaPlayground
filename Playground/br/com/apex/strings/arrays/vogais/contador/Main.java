package br.com.apex.strings.arrays.vogais.contador;

import javax.swing.JOptionPane;

public class Main {

	private static String frase = JOptionPane.showInputDialog("Digite uma Frase");

	public static void main(String[] args) {

		int quantidadeVogais = contadorVogais(normalizarTexto(frase));
		JOptionPane.showMessageDialog(null,
				"A frase que voce informou foi: \n" + frase + "\nSua frase possui: " + quantidadeVogais + " vogais");
	}

	private static String normalizarTexto(String texto) {

		String textoNormalizado = "";

		for (int i = 0; i < texto.length(); i++) {
			char letraPosicao = texto.charAt(i);
			if (Character.isLetter(letraPosicao)) {
				textoNormalizado += Character.toUpperCase(letraPosicao);
			}
		}
		return textoNormalizado;
	}

	private static int contadorVogais(String texto) {

		int contaVogais = 0;
		for (int i = 0; i < texto.length(); i++) {
			String letraPosicao = String.valueOf(texto.charAt(i));
			if (letraPosicao.equals("A") || letraPosicao.equals("E") || letraPosicao.equals("I")
					|| letraPosicao.equals("O") || letraPosicao.equals("U")) {
				contaVogais += 1;
			} else {
				contaVogais += 0;
			}
		}
		return contaVogais;
	}
}
