
public class Main  extends Thread{
	public static void main(String[] args) {
		new Matriz();
		
		Matriz.imprimirOperando1();
		Matriz.imprimirOperando2();
		
		for (int i = 0; i < Matriz.LIN1 ; i++) {
			for (int j = 0; j < Matriz.COL2 ; j++) {
				new Multiplicadora(i, j).start();
			}
		}
		
		do {
			Matriz.imprimirResultado();
			try {Thread.sleep(1000);} 
			catch (Exception e) {}
		} while (Thread.activeCount() > 1);
		
	}
}
