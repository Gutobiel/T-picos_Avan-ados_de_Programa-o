import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel{
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private int qtdPorcoes = 0;

	// Métodos get/set da classe
	public int getQtdPorcoes() {
		return qtdPorcoes;
	}

	public void setQtdPorcoes(int qtdPorcoes) {
		this.qtdPorcoes = qtdPorcoes;
	}
	
	// Método sobrescrito da classe
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(10, 550 - (10 * qtdPorcoes), 265, 10 * qtdPorcoes);
	}
}