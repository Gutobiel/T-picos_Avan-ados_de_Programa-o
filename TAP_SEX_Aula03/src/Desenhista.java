
public class Desenhista extends Thread {
	// Propriedades da classe
	private Painel objPainel = null;

	// Método construtor cheio da classe
	public Desenhista(Painel objPainel) {
		super();
		this.objPainel = objPainel;
	}
	
	// Método de execução paralela da classe
	public void run() {
		while (true) {
			objPainel.setQtdPorcoes(Caldeirao.getPorcoes());
			objPainel.repaint();
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}