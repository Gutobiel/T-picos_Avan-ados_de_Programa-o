import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exibidora extends Thread {
	// Propriedades da classe
	private JFrame visao = null;
	private JLabel lblNumero = null;

	// Método construtor cheio da classe
	public Exibidora(JFrame visao, JLabel lblNumero) {
		super();
		this.visao = visao;
		this.lblNumero = lblNumero;
	}
	
	// Método de execução paralela da classe
	public void run() {
		while (true) {
			lblNumero.setText("" + 
				MemoriaCompartilhada.getNumero());
			visao.repaint();
			try {Thread.sleep(500);}catch (Exception e) {}
		}
	}
}