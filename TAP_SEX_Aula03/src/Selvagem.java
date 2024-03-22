public class Selvagem extends Thread {
	// Propriedades da classe
	private Cozinheiro objCozinheiro = null;
	
	// Método construtor cheio da classe	
	public Selvagem(Cozinheiro objCozinheiro) {
		super();
		this.objCozinheiro = objCozinheiro;
	}
	
	// Método de execução paralela da classe
	public void run() {
		while (true) {
			if (Caldeirao.getPorcoes() > 0) {
				Caldeirao.comer();
			} else {
				objCozinheiro.setSemaforo(true);
			}
			try {sleep(1000);}catch (Exception e) {}
		}
	}
}