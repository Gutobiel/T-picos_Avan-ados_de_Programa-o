
public class MemoriaCompartilhada {
	// Propriedades da classe
	private static int numero = 50;
	
	// Métodos da classe
	public synchronized static int getNumero() {
		return numero;
	}
	
	public synchronized static void incrementar() {
		if (numero < 100) {
			numero++;
		}
	}
	
	public synchronized static void decrementar() { 
		if (numero > 0) {
			numero--;
		}
	}
}