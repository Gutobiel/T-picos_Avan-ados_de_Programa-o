import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Painel extends JPanel {
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	private int x = 240;
	
	//Metodo da classe
	public void incrementarX() {
		if(x<680) {
			x++;
		} else {
			x = 240;
		}
	}
	//Metodo de pintura sobrescrito da classe
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(new ImageIcon("pombocorreio.png").getImage(),x,300,80,80,null);
	}
}
