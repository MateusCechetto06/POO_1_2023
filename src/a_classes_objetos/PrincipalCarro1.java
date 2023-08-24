package a_classes_objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalCarro1 {
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		String menu = "1 - Cadastrar\n"
				    + "2 - Listar por Periodo\n"
				    + "3 - Listar por Marca\n"
				    + "4 - Listar por Cor\n"
				    + "5 - Sair\n\n";
		
		int op = 0;
		int qtd = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if( op == 1) {
				Carro c = new Carro();
				
				if (c.cadastra() == 1) {
					carros.add(c);
				}
				
			}else if(op == 2) {
				
				int anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano inicial:"));
				int anoFinal   = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano final:"));
				
				String result = "Carros cadastros no periodo:\n\n";
				
				for(Carro c: carros) {
					if (c.ano >= anoInicial && c.ano <= anoFinal) {
						result += c.listarCarro();
						qtd++;
					}
				}
				
				if(qtd > 0) {
					result += "Porcetagem de carros com o periodo escolhido: " + (((double)qtd * 100)/(double)carros.size()) + "%";
					qtd = 0;
				}
				
				JOptionPane.showMessageDialog(null, result);	
			}else if(op == 3) {
				String marcaCarro = JOptionPane.showInputDialog("Digite a marca:");
				
				String result = "Carros cadastros com a marca:\n\n";
				
				for(Carro c: carros) {
					if (c.marca.equalsIgnoreCase(marcaCarro)) {
						result += c.listarCarro();
						qtd++;
					}
				}
				
				if(qtd > 0) {
					result += "Porcetagem de carros com a marca escolhida: " + (((double)qtd * 100)/(double)carros.size()) + "%";
					qtd = 0;
				}
				
				JOptionPane.showMessageDialog(null, result);
			}else if(op == 4) {
				String corCarro = JOptionPane.showInputDialog("Digite a cor:");
				
				String result = "Carros cadastros com a cor:\n\n";
				
				for(Carro c: carros) {
					if (c.cor.equalsIgnoreCase(corCarro)) {
						result += c.listarCarro();
						qtd++;
					}
				}
				
				if(qtd > 0) {
					result += "Porcetagem de carros com a cor escolhida: " + (((double)qtd * 100)/(double)carros.size()) + "%";
					qtd = 0;
				}
				
				JOptionPane.showMessageDialog(null, result);
			}
			
			
		}while(op != 5);
	}
}
