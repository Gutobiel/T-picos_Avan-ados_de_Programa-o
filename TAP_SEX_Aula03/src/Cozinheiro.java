public class Cozinheiro extends Thread {
	// Propriedades da classe
	private boolean semaforo = false;
	
	// Métodos da classe
	public void setSemaforo(boolean semaforo) {
		this.semaforo = semaforo;
	}
	
	public void run() {
		while (true) {
			if (semaforo) {
				Caldeirao.cozinhar();
				semaforo = false;
			} else {
				try {sleep(5000);}catch (Exception e) {}
			}
		}
	}
}