public class Incrementadora extends Thread {
	public void run() {
		while (true) {
			MemoriaCompartilhada.incrementar();
			try {sleep((int) (1000 * Math.random()));}
			catch (Exception e) {}
		}
	}
}