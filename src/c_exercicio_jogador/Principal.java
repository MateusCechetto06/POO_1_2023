package c_exercicio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		ArrayList<Time> times = new ArrayList<Time>();
		
		String menu = "1 - Cadastrar time\n"
				    + "2 - Listar jogadores do time\n"
				    + "3 - Verificar o artilheiro do time\n"
				    + "4 - Verificar o time que mais fez mais gols\n"
				    + "5 - Sair\n\n";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if( op == 1) {
				Time t = new Time();
				
				t.cadastrar();
				times.add(t);	
			}else if( op == 2) {
				String nome = JOptionPane.showInputDialog("Digite o nome do time:");
				
				for(Time t: times) {
					if(t.getNome().equalsIgnoreCase(nome)) {
						JOptionPane.showMessageDialog(null, t.exibir());
					}
				}
			}else if(op == 3) {
				String nome = JOptionPane.showInputDialog("Digite o nome do time:");
				
				for(Time t: times) {
					if(t.getNome().equalsIgnoreCase(nome)) {
						JOptionPane.showMessageDialog(null,t.artilheiroTime().exibir());
					}
				}
			}else if(op == 4) {
				Time timeArt = times.get(0);
				for(Time t: times) {
					if(t.getGolsTime() > timeArt.getGolsTime()) {
						timeArt = t;
					}
				}
				
				JOptionPane.showMessageDialog(null,timeArt.exibir());
			}
			
		}while(op != 5);
		
		
	}
}
