
public class Multiplicadora extends Thread {
	//Propriedades da classe
	private int linha = 0;
	private int coluna = 0;
	
	//Metodos construtor cheio - apenas
	public Multiplicadora(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//Metodo de execução paralela da classe
	public void run() {
		int soma = 0;
		for (int i = 0; i < Matriz.COL1LIN2; i++) {
			soma += (Matriz.getOperando1()[linha][i] * Matriz.getOperando2()[i][coluna]);
		}
		Matriz.setResultado(linha, coluna, soma);
	}
}
