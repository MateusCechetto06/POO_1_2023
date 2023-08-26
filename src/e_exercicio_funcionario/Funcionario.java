package e_exercicio_funcionario;

import javax.swing.JOptionPane;

public class Funcionario {
	static int totalFuncionarios = 0;
	static int idadeMinima = 16;
	
	public static void contratar(String nome, int idade) {
		if(idade >= idadeMinima) {
			totalFuncionarios ++;
			JOptionPane.showMessageDialog(null,"Contratação realizada com sucesso");
		}else{
			JOptionPane.showMessageDialog(null, "Idade minima para o funcionário não permitida para a contratação");
		}
	}
	
	public static int getTotalFuncionarios() {
		return totalFuncionarios;
	}
	public static int getIdadeMinima() {
		return idadeMinima;
	}
	
	
}
