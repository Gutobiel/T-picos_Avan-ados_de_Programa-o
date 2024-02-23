
public class Paralela extends Thread {
	//Propriedades da classe
	private int numero = 0;

	//Metodo construtor cheio
	public Paralela(int numero) {
		super();
		this.numero = numero;
	}
	//Metodo sobrescrito da classe
	public void run() {
		System.out.println("Paralela número: " + numero);
		System.out.println("Quantidade de threads no numero " +
							Thread.currentThread().getName() + ": " + Thread.activeCount());
	}
}
