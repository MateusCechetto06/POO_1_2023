package d_exercicio_livros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>(); 
		
		String menu = "1 - Cadastrar livro\n"
			    + "2 - Listar Livros\n"
			    + "3 - Listar livros por autor\n"
			    + "4 - Listar livros por preço\n"
			    + "5 - Listar livros por autor menor de 12 anos.\n"
			    + "6 - Listar livros por sexo\n"
			    + "7 - Sair\n\n";
	
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if( op == 1) {
				Livro l = new Livro();
				if (l.cadastrar()) {
					livros.add(l);
				}
			}else if( op == 2) {
				for(Livro l: livros) {
					JOptionPane.showMessageDialog(null,l.exibir());
				}
			}else if( op == 3) {
				String nome = JOptionPane.showInputDialog("Digite o nome do autor:");
				
				for(Livro l: livros) {
					if(l.buscaAutor(nome)) {
						JOptionPane.showMessageDialog(null,l.exibir());
					}
				}
			}else if( op == 4) {
				Double precoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial:"));
				Double precoFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor final:"));
				
				for(Livro l: livros) {
					if(l.getPreco() >= precoInicial && l.getPreco() <= precoFinal) {
						JOptionPane.showMessageDialog(null,l.exibir());
					}
				}
			}else if ( op == 5) {
				for(Livro l : livros) {
					if(l.buscaAutorIdade()) {
						JOptionPane.showMessageDialog(null,l.exibir());
					}
				}
			}else if (op == 6) {
				String sexo = JOptionPane.showInputDialog(null, "Digite o sexo do autor:");
				
				for(Livro l : livros) {
					if(l.buscaAutorSexo(sexo)) {
						JOptionPane.showMessageDialog(null,l.exibir());
					}
				}
			}
		
			
		}while(op != 7);
	}
}
