package br.com.crypto.caesar;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {

		//Parâmetros de Entrada (string, padrão de criptografia e padrão de agrupamento).
		String preEncryptedText = JOptionPane.showInputDialog("Digite uma String a ser criptografa (Letras e pontuações).");
		int alphabetShifter = Integer.parseInt(JOptionPane.showInputDialog("Digite o Parâmetro de Criptografia (Apenas números inteiros)."));
		int groupSize = Integer.parseInt(JOptionPane.showInputDialog("Digite o Parâmetro de Agrupamento (Apenas números inteiros)."));
		
		//Aplicação dos Métodos
		String encryptedString = encryptString(preEncryptedText,alphabetShifter,groupSize);
		String decryptedString = decrypt(encryptedString, alphabetShifter);
		
		//Exibição das Saídas
		JOptionPane encryptedTextOutput = new JOptionPane();
		encryptedTextOutput.setMessage("String Criptografada: "+encryptedString+". Decriptografada: "+decryptedString);
		encryptedTextOutput.setMessageType(JOptionPane.INFORMATION_MESSAGE);
		JDialog outputMessage = encryptedTextOutput.createDialog(null, "Resultado de Criptografia");
		outputMessage.setVisible(true);		
	}
		
	//Remover pontuações, textos e espaços do texto de entrada
    public static String normalizeText(String text) {

        String normalizedText = "";
        for (int i = 0; i < text.length(); i++) {
            
        	char characterAt = text.charAt(i);
            	
        	if (Character.isLetter(characterAt)) {
            		
        		normalizedText += Character.toUpperCase(characterAt);
            }
        }
        return normalizedText;
    }

	
	//Mapear posciionamento do texto de entrada e aplicar novo padrão de posicionamento. 
	public static String caesarify(String normalizedText, int alphabetShifter) {	
		
		String repositionedText = "";
		String newPosition = shiftAlphabet(alphabetShifter);
	
		for (int i = 0; i < normalizedText.length();i++)
			repositionedText += newPosition.charAt((int)normalizedText.charAt(i)-65);
				return repositionedText;
	}
	
	//Converter novo padrão de posicionamento em texto.
	public static String shiftAlphabet(int shift) {
	    int start = 0;
	    if (shift < 0) {
	        start = (int) 'Z' + shift + 1;
	    } else {
	        start = 'A' + shift;
	    }
	    String result = "";
	    char currChar = (char) start;
	    for(; currChar <= 'Z'; ++currChar) {
	        result = result + currChar;
	    }
	    if(result.length() < 26) {
	        for(currChar = 'A'; result.length() < 26; ++currChar) {
	            result = result + currChar;
	        }
	    }
	    return result;
	}
	
	//Aplicar padrão de agrupamento
    public static String groupify(String text, int len) {
        String result = "";
        for (int i = 0; i < text.length(); i += len) {
            if (i + len < text.length()) {
                result += text.substring(i, i + len);
                result += " ";
            } else {
                String rest = text.substring(i);
                result += rest;
                for (int j = 0; j < len - rest.length(); j++) {
                    result += 'x';
                }
            }
        }
        return result;
    }

    //Aplicar os métodos de criptografia
    public static String encryptString(String text, int shift, int groupSize) {
        String result;
        result = normalizeText(text);
        result = caesarify(result, shift);
        result= groupify(result, groupSize);
        return result;
    }
    
    //Desagrupar texto criptografado conforme o padrão de agrupamento
    public static String ungroupify(String ungroupText) {

        String ungroupifiedText = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for (int i = 0; i < ungroupText.length(); i++) {
            
        	if (alphabet.indexOf(ungroupText.charAt(i)) != -1) {
                
        		ungroupifiedText += ungroupText.charAt(i);
            }
        }
        return ungroupifiedText;
    }
	
    //Decriptografar conforme função de desagrupamento e padrão de posicionamento escolhido
    public static String decrypt(String decryptEncrypted, int alphabetShifter) {
        return (caesarify(ungroupify(decryptEncrypted), -alphabetShifter));
    }  
}
