
public class Principal {
	private static final int QTD_THREAD = 1000;
	public static void main(String[] args) {
		
		Paralela[] vetor = new Paralela[QTD_THREAD];
		
		for (int i = 0; i <QTD_THREAD ; i++){
		vetor[i] = new Paralela(i);
	}
		for (int i = 0; i < QTD_THREAD ; i++) {
		vetor[i].start();
		}
	}
}
