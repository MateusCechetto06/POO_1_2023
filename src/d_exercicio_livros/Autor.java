package d_exercicio_livros;

import javax.swing.JOptionPane;

public class Autor {
	/*nome, sexo e idade*/
	String nome;
	String sexo;
	int idade;
	
	public boolean cadastrar(){
		setNome(JOptionPane.showInputDialog("Informe o nome do autor:"));
		setSexo(JOptionPane.showInputDialog("Informe o sexo:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
		
		if (getNome() != null && getIdade() != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String exibir() {
		return getNome() + " - " + getSexo() + " - " + getIdade() + "\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.trim().contains(" ")) {
			this.nome = nome;
		}else {
			JOptionPane.showMessageDialog(null,"O nome do autor precisa conter nome e sobrenome!");
		}
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0 ) {
			this.idade = idade;
		}else {
			JOptionPane.showMessageDialog(null,"A idade do autor precisa ser maior que zero!");
		}
	}
	
	
}
