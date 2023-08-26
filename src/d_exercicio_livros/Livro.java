package d_exercicio_livros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {
	/*titulo, preço e autores*/
	private String titulo;
	private double preco;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	
	public boolean cadastrar(){
		setTitulo(JOptionPane.showInputDialog("Informe o título do livro:"));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:")));
		
		String continua = "";
		
		do {
			
			Autor a = new Autor();
			if (a.cadastrar()) {
				autores.add(a);
			}
			
			continua = JOptionPane.showInputDialog("Mais autores? S/N");
		
		}while(continua.equalsIgnoreCase("S") && autores.size() <= 3);
		
		if (getPreco() != 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public String exibir() {
		String dados = getTitulo() + " - R$" + getPreco() + "\nAutores:\n";
		
		for(Autor a: autores) {
			dados += a.exibir();
		}
		
		return dados;
	}
	
	public boolean buscaAutor(String nomeAutor) {
		for(Autor a: autores) {
			if(a.getNome().equalsIgnoreCase(nomeAutor)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean buscaAutorIdade() {
		for(Autor a: autores) {
			if(a.getIdade() <= 12) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean buscaAutorSexo(String Sexo) {
		boolean aux = false;
		char sexoAutores;
		char sexoAutor = Sexo.toUpperCase().charAt(0);
		
		for(Autor a: autores) {
			sexoAutores = a.getSexo().toUpperCase().charAt(0);
			if(sexoAutores == sexoAutor){
				aux = true;
			}else {
				aux = false;
			}
			
			if(aux == false) {
				return aux;
			}
			
		}
		
		return aux;
	}
	
	public String getTitulo() {
		return titulo.toLowerCase();
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		}else {
			JOptionPane.showMessageDialog(null,"O preço do livro precisa ser maior que zero!");
		}
	}
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	
	
}
