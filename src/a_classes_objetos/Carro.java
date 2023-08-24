package a_classes_objetos;

import javax.swing.JOptionPane;

public class Carro {
	String marca;
	String cor;
	int ano;
	
	int cadastra() {
		marca = JOptionPane.showInputDialog("Informe a marca:");
		cor = JOptionPane.showInputDialog("Informe a cor:");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		
		if(marca.equals("")) {
			JOptionPane.showMessageDialog(null, "A marca é obrigatória!");
			return 0;
		}
		if(cor.equals("")) {
			JOptionPane.showMessageDialog(null, "A cor é obrigatória!");
			return 0;
		}
		if(ano < 1954 && ano > 2023) {
			JOptionPane.showMessageDialog(null, "Ano digitado é inválido!");
			return 0;
		}
		
		return 1;
		
	}
	
	String listarCarro() {
		return  marca + " - " + cor + " - " + ano + "\n";
	}
	

}
