public class Caldeirao {
	// Propriedades da classe
	private static int porcoes = 0;
	
	// Métodos da classe
	public synchronized static int getPorcoes() {
		return porcoes;
	}
	
	public synchronized static void comer() {
		if (porcoes > 0) {
			porcoes--;
		}
	}
	
	public synchronized static void cozinhar() {
		porcoes = ((int) (50 * Math.random()));
	}
}