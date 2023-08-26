package e_exercicio_funcionario;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int op = 0;
		
		String menu = "1 - Cadastrar novo funcionário\n"
				    + "2 - Mostrar total de funcionários\n"
				    + "3 - Sair\n\n";
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if ( op == 1) {
				String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário");
				int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade"));
				
				Funcionario.contratar(nome, idade);
			}else if(op == 2) {
				JOptionPane.showMessageDialog(null,"Total de funcionários: " +
			                                        Funcionario.getTotalFuncionarios());
			}
		}while(op !=3);
	}
}
