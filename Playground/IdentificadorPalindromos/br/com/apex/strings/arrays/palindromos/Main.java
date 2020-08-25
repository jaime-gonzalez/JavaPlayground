package br.com.apex.strings.arrays.palindromos;

import javax.swing.JOptionPane;

public class Main {

	private static String palavra = JOptionPane.showInputDialog("Digite uma palavra qualquer");

	public static void main(String[] args) {

		String palavraNormalizada = normalizarTexto(palavra);

		String palavraInvertida = inverterTexto(palavraNormalizada);

		String checarPalindromo = checarPalindromo(palavraNormalizada, palavraInvertida);

		JOptionPane.showMessageDialog(null, "A palavra Informada foi:" + palavraNormalizada
				+ "\nSua Palavra ao contrário fica:" + palavraInvertida + "\n" + checarPalindromo);
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

	private static String inverterTexto(String texto) {

		StringBuffer inversor = new StringBuffer(texto).reverse();
		String palavraInvertida = inversor.toString();

		return palavraInvertida;
	}

	private static String checarPalindromo(String texto, String textoInvertido) {

		String diagnostico = "";
		if (textoInvertido.equals(texto)) {
			diagnostico = "A palavra informada é um palindromo";
		} else {
			diagnostico = "A palavra informada não é um palindromo";
		}

		return diagnostico;
	}
}
