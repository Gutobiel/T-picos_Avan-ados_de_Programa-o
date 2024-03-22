public class Decrementadora extends Thread {
	public void run() {
		while (true) {
			MemoriaCompartilhada.decrementar();
			try {sleep((int) (1000 * Math.random()));}
			catch (Exception e) {}
		}
	}
}